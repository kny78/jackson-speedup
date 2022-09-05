package im.kny.jacksonspeedup.mock

import com.fasterxml.jackson.databind.JsonNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson as FregPerson


class ValidateDeserializerTest : AbstractDeserializerTest() {

    @Test
    fun validateMapping() {
        val data = oneJsonDok
        val valueDeserializer: FregPerson = objectMapperWithDeserializers.readValue(data, FregPerson::class.java)
        val treeDeserializer: JsonNode = objectMapperWithDeserializers.valueToTree(valueDeserializer)

        val valueReflection: FregPerson = objectMapperWithReflection.readValue(data, FregPerson::class.java)
        val treeReflection: JsonNode = objectMapperWithReflection.valueToTree(valueReflection)

        assertEquals(treeReflection, treeDeserializer, "tree should be equal")
    }
}