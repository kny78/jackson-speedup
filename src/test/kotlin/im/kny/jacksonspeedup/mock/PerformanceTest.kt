package im.kny.jacksonspeedup.mock

import com.fasterxml.jackson.databind.*
import im.kny.jacksonspeedup.StopWatchUtil
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.math.min
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson as FregPerson


class PerformanceTest : AbstractDeserializerTest() {

    val rounds = 10
    val minSpeedup: Double = 2.0

    @Test
    fun withDeserializers() {

        var minDeserializeMs = Double.MAX_VALUE
        var minReflectionMs = Double.MAX_VALUE
        var sumDeserializerMs = 0.0
        var sumReflectionMs = 0.0

        (1..rounds).forEach { roundNo ->
            println("\nRound $roundNo")
            val deserializersMs = runDeserialize("DeSerializers", objectMapperWithDeserializers)
            minDeserializeMs = min(minDeserializeMs, deserializersMs)
            sumDeserializerMs += deserializersMs

            val reflectionMs = runDeserialize("Reflection", objectMapperWithReflection)
            minReflectionMs = min(minReflectionMs, reflectionMs)
            sumReflectionMs += reflectionMs
        }


        val avgTimeDeserializers = df.format(sumDeserializerMs / rounds)
        val avgTimeReflection = df.format(sumReflectionMs / rounds)
        val speedup = minReflectionMs / minDeserializeMs
        val speedupStr = df.format(speedup)

        val expParseTimeReflection = (11_000 * minReflectionMs / 1000)
        val expParseTimeDeserializer = (11_000 * minDeserializeMs / 1000)
        val generated_mb_s = df2.format(_1000_docs_byteArray.size / (minDeserializeMs * 1000))
        val reflection_mb_s = df2.format(_1000_docs_byteArray.size / (minReflectionMs * 1000))
        println(
            "\n\n\n" +
                    """
            Number of bytes in Json: ${_1000_docs_byteArray.size}
            Generated  Mb/s: $generated_mb_s
            Reflection Mb/s: $reflection_mb_s
                
            Best DeSerializers: ${minDeserializeMs.toInt()} millis
            Best Reflection: ${minReflectionMs.toLong()} millis
            Speedup: $speedupStr
            
            Avg DeSerializers: $avgTimeDeserializers millis 
            Avg Reflection: $avgTimeReflection millis
            
                
            Expected parsetime for 11 million documents:
            11 million with deserializers ${df.format(expParseTimeDeserializer)} seconds
            11 million with Reflection: ${df.format(expParseTimeReflection)} seconds
            
            """.trimIndent()
        )

        assertTrue(speedup > minSpeedup, "Expect Speedup > $minSpeedup. Was: $speedupStr")
    }


    private fun runDeserialize(
        method: String,
        om: ObjectMapper,
    ): Double {
        val stopWatchUtil = StopWatchUtil("$method")

        stopWatchUtil.use {
            om.readValue(_1000_docs_byteArray, Array<FregPerson>::class.java)
        }
        val ms = stopWatchUtil.sw.nanoTime / 1_000_000.0
        return ms
    }
}