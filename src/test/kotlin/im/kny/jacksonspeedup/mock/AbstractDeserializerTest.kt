package im.kny.jacksonspeedup.mock

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson
import java.text.DecimalFormat

open class AbstractDeserializerTest {
    val df = DecimalFormat("#.###")
    val df2 = DecimalFormat("#")

    val objectMapperWithReflection by lazy(LazyThreadSafetyMode.NONE) {
        buildCommonObjectMapper()
    }


    val objectMapperWithDeserializers by lazy(LazyThreadSafetyMode.NONE) {
        val simpleModule = SimpleModule()
            .addDeserializer(
                Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson::class.java,
                Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson.deserializer
            )
        buildCommonObjectMapper().registerModule(simpleModule)
    }


    protected val oneJsonDok: String = run {
        val jsonNode: JsonNode? =
            PerformanceTest::class.java.getResourceAsStream("/4-person.json").use { inputStream ->
                objectMapperWithDeserializers.readTree(inputStream)
            }
        jsonNode.toString()
    }

    protected val _1000_jsonDoks: String = run {
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

    val _1000_docs_byteArray = _1000_jsonDoks.toByteArray()

    private fun buildCommonObjectMapper() = ObjectMapper()
        .registerModule(Jdk8Module())
        .registerKotlinModule()
        .registerModule(JavaTimeModule())
        .configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false)
        .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        .setSerializationInclusion(JsonInclude.Include.NON_NULL)
}