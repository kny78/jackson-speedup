package im.kny.jacksonspeedup.mock

import com.fasterxml.jackson.databind.JsonNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson as FregPerson


class ValidateDeserializerTest : AbstractDeserializerTest() {

    @Test
    fun validateMapping() {
        val data = oneJsonDok
        val valueWithDeserializers: FregPerson = objectMapperWithDeserializers.readValue(data, FregPerson::class.java)
        val treeGenratedDeserializer: JsonNode = objectMapperWithDeserializers.valueToTree(valueWithDeserializers)

        val valueWithReflection: FregPerson = objectMapperWithReflection.readValue(data, FregPerson::class.java)
        val reflectionTree: JsonNode = objectMapperWithReflection.valueToTree(valueWithReflection)

        assertEquals(treeGenratedDeserializer, reflectionTree, "tree")
    }
}