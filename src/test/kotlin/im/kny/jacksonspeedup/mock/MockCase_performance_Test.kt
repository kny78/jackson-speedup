package im.kny.jacksonspeedup.mock

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson
import org.junit.jupiter.api.Test
import java.text.DecimalFormat
import kotlin.math.min
import kotlin.test.assertEquals
import kotlin.test.assertTrue


class MockCase_performance_Test {

    val df = DecimalFormat("#.##")

    val objectMapperWithReflection by lazy(LazyThreadSafetyMode.NONE) {
        buildCommonObjectMapper()
    }

    val objectMapperWithDeserializers by lazy(LazyThreadSafetyMode.NONE) {
        buildCommonObjectMapper().registerModule(simpleModule)
    }

    private fun buildCommonObjectMapper() = ObjectMapper()
        .registerModule(Jdk8Module())
        .registerKotlinModule()
        .registerModule(JavaTimeModule())
        .configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false)
        .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        .setSerializationInclusion(JsonInclude.Include.NON_NULL)

    val simpleModule by lazy(LazyThreadSafetyMode.NONE) {
        SimpleModule()
            .addDeserializer(
                Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson::class.java,
                Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson.Deserializer()
            )
    }

    /*

        MANY TESTS
        val warmupIterations = 20
        val timedIterations = 1
        val rounds = 30
        val minSpeedup: Double = 2.5
        */

    val warmupIterations = 5
    val rounds = 100
    val minSpeedup: Double = 2.0

    @Test
    fun withDeserializers() {


        (1..warmupIterations).forEach { runIterations("Warmup $it", objectMapperWithDeserializers) }

        var minDeserializeMs = Double.MAX_VALUE
        var minReflectionMs = Double.MAX_VALUE
        var sumDeserializerMs = 0.0
        var sumReflectionMs = 0.0

        (1..rounds).forEach {
            println("\nRound $it")
            val tmp = runIterations("DeSerializers", objectMapperWithDeserializers)
            minDeserializeMs = min(minDeserializeMs, tmp)
            sumDeserializerMs += tmp
            val tmpRefl = runIterations("Reflection", objectMapperWithReflection)
            minReflectionMs = min(minReflectionMs, tmpRefl)
            sumReflectionMs += tmpRefl
        }


        val avgTimeDeserializers = df.format(sumDeserializerMs / rounds)
        val avgTimeReflection = df.format(sumReflectionMs / rounds)
        val speedup = minReflectionMs / minDeserializeMs
        val speedupStr = df.format(speedup)

        val expParseTimeReflection = (11_000 * minReflectionMs)
        val expParseTimeDeserializer = (11_000 * minDeserializeMs)
        println(
            """
            Avg time Deserializers: $avgTimeDeserializers millis and min: ${df.format(minDeserializeMs)} millis
            Avg time Reflection: $avgTimeReflection millis and min: ${df.format(minReflectionMs)} millis
            Speedup: $speedupStr
                
            Expected parsetime for 11 million documents:
            11 million with deserializers ${df.format(expParseTimeDeserializer)} seconds
            11 million with Reflection: ${df.format(expParseTimeReflection)} seconds
            
            """.trimIndent()
        )

        assertTrue(speedup > minSpeedup, "Expect Speedup > $minSpeedup. Was: $speedupStr")
    }


    private fun runIterations(
        method: String,

        om: ObjectMapper,
    ): Double {
        val stopWatchUtil = im.kny.jacksonspeedup.StopWatchUtil("$method")

        stopWatchUtil.use {
            //byteInputStream.reset()
            om.readValue(
                _1000_jsonDoks,
                Array<Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson>::class.java
            )
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
    val toByteArray by lazy(LazyThreadSafetyMode.NONE) { _1000_jsonDoks.toByteArray() }
    val byteInputStream by lazy(LazyThreadSafetyMode.NONE) {
        toByteArray.inputStream()
    }

    private val oneJsonDok: String by lazy(LazyThreadSafetyMode.NONE) {
        val jsonNode: JsonNode? =
            MockCase_performance_Test::class.java.getResourceAsStream("/4-person.json").use { inputStream ->
                objectMapperWithDeserializers.readTree(inputStream)
            }

        jsonNode.toString()
    }

    companion object {
    }
}