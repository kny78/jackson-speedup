package im.kny.jacksonspeedup.mock

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.afterburner.AfterburnerModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson

import org.junit.jupiter.api.Test
import java.text.DecimalFormat
import kotlin.math.min
import kotlin.test.assertEquals


class MockCase_performance_Proto {

    val df = DecimalFormat("#.##")

    val objectMapperWithReflection by lazy(LazyThreadSafetyMode.NONE) {
        ObjectMapper()
            .registerModule(Jdk8Module())
            .registerModule(KotlinModule())
            .registerModule(JavaTimeModule())
            .registerModule(AfterburnerModule())
            .configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false)
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
            .enable(MapperFeature.ALLOW_COERCION_OF_SCALARS)
    }

    val objectMapperWithDeserializers by lazy(LazyThreadSafetyMode.NONE) {
        ObjectMapper()
            .registerModule(simpleModule)
            .registerModule(Jdk8Module())
            .registerModule(KotlinModule())
            .registerModule(JavaTimeModule())
                      .registerModule(AfterburnerModule())
            .configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false)
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
            .enable(MapperFeature.ALLOW_COERCION_OF_SCALARS)
    }

    val simpleModule by lazy(LazyThreadSafetyMode.NONE) {
        SimpleModule()

            .addDeserializer(
                Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson::class.java,
                Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson.Deserializer()
            )
    }


    val warmupIterations = 100
    val timedIterations = 1

    @Test
    fun withDeserializers() {
        val rounds = 10

        val json = _1000_jsonDoks
        runIterations("Warmup", warmupIterations, objectMapperWithDeserializers, json)

        var minDeserializeMs = Double.MAX_VALUE
        var minReflectionMs = Double.MAX_VALUE
        var sumDeserializerMs: Double = 0.0
        var sumReflectionMs: Double = 0.0

        (1..rounds).forEach {
            println("\nRound $it")
            val tmp = runIterations("DeSerializers", timedIterations, objectMapperWithDeserializers, json)
            minDeserializeMs = min(minDeserializeMs, tmp)
            sumDeserializerMs += tmp
            val tmpRefl = runIterations("Reflection", timedIterations, objectMapperWithReflection, json)
            minReflectionMs = min(minReflectionMs, tmpRefl)
            sumReflectionMs += tmpRefl
        }


        val avgTimeDeserializers = df.format(sumDeserializerMs / rounds)
        println("Avg time Deserializers: $avgTimeDeserializers millis and min: ${df.format(minDeserializeMs)} millis")
        val avgTimeReflection = df.format(sumReflectionMs / rounds)
        println("Avg time Reflection: $avgTimeReflection millis and min: ${df.format(minReflectionMs)} millis")
        val speedup = df.format(minReflectionMs / minDeserializeMs)
        println("Speedup: $speedup")

        val expParseTimeReflection = (11_000 * minReflectionMs) / (timedIterations)
        val expParseTimeDeserializer = (11_000 * minDeserializeMs) / (timedIterations)
        println(
            """
            Expected parsetime for 11 million documents:
            11 million with deserializers ${df.format(expParseTimeDeserializer)} seconds
            11 million with Reflection: ${df.format(expParseTimeReflection)} seconds
            
            """.trimIndent()
        )
    }


    private fun runIterations(
        method: String,
        iterations: Int,
        om: ObjectMapper,
        json: String
    ): Double {

        val stopWatchUtil = im.kny.jacksonspeedup.StopWatchUtil("$method - $iterations")
        stopWatchUtil.use {
            (1..iterations).forEach {
                val value = om.readValue(
                    json,
                    Array<Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson>::class.java
                )

                /*val value = om.readValue(
                    oneJsonDok,
                    Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson::class.java
                )*/
            }
        }
        return stopWatchUtil.sw.nanoTime / 1_000_000_000.0
    }

    @Test
    fun validateMapping() {
        val data = oneJsonDok
        val origTree = this.objectMapperWithDeserializers.readTree(data)
        val valueWithDeserializers = objectMapperWithDeserializers.readValue(
            data,
            Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson::class.java
        )
        val treeAfterDeserializers = objectMapperWithDeserializers.valueToTree<JsonNode>(valueWithDeserializers)

        assertEquals(origTree.toString().length, treeAfterDeserializers.toString().length, "Same length")
        val valueWithReflection = objectMapperWithReflection.readValue(
            data,
            Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson::class.java
        )
        val treeAfterReflection = objectMapperWithReflection.valueToTree<JsonNode>(valueWithReflection)

        assertEquals(treeAfterDeserializers, treeAfterReflection, "tree")
    }

    private val _1000_jsonDoks: String by lazy(LazyThreadSafetyMode.NONE) {
        val jsonDok = oneJsonDok
        val sb = StringBuilder()
        sb.append("[")
        sb.append(jsonDok)
        (1..999).forEach { i ->
            sb.append(",")
            sb.append(jsonDok)
        }
        sb.append("]")
        sb.toString()
    }

    private val oneJsonDok: String by lazy(LazyThreadSafetyMode.NONE) {
        val jsonNode: JsonNode? =
            MockCase_performance_Proto::class.java.getResourceAsStream("/4-person.json").use { inputStream ->
                objectMapperWithDeserializers.readTree(inputStream)
            }

        jsonNode.toString()
    }

    companion object {
    }
}