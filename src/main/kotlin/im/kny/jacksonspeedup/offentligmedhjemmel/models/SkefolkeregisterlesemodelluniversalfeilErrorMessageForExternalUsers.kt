/**
 * Folkeregisteret - offentlig med hjemmel
 *
 * Dokumentasjonen av tjenestene via swaggerhub er under testing.  Beskrivelsene under dokumenterer rettighetspakken Offentlig med hjemmel.  Tilgang til API-et styres med OAuth2-baserte access_tokens.  Mer informasjon om tjenestene, hvordan du får tilgang og finnes på [folkeregisteret-api-dokumentasjon](https://skatteetaten.github.io/folkeregisteret-api-dokumentasjon/konsumenttjenester/)  Dokumentasjonen kan foreløpig ikke benyttes til kall mot Folkeregisterets testmiljøer.
 *
 * The version of the OpenAPI document: 1.5
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package im.kny.jacksonspeedup.offentligmedhjemmel.models


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.type.*


/**
 * 
 *
 * @param code 
 * @param feilreferanse 
 * @param httpStatus 
 * @param message 
 */

data class SkefolkeregisterlesemodelluniversalfeilErrorMessageForExternalUsers (

    @field:JsonProperty("code")
    val code: kotlin.String? = null,

    @field:JsonProperty("feilreferanse")
    val feilreferanse: kotlin.String? = null,

    @field:JsonProperty("httpStatus")
    val httpStatus: kotlin.Int? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null

) {

    class ParsedValues{
        var code: kotlin.String? = null
        var feilreferanse: kotlin.String? = null
        var httpStatus: kotlin.Int? = null
        var message: kotlin.String? = null
    }

    @Suppress("UNUSED_VALUE")
    class Deserializer : JsonDeserializer<SkefolkeregisterlesemodelluniversalfeilErrorMessageForExternalUsers>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): SkefolkeregisterlesemodelluniversalfeilErrorMessageForExternalUsers {
            val parsedValues = ParsedValues()
            var curr = p.currentToken
            if (curr != JsonToken.START_OBJECT) {
                throw IllegalStateException("Should be start object")
            }
            curr = p.nextToken()
            while (curr == JsonToken.FIELD_NAME) {
                val field = p.text
                curr = p.nextToken()
                when (field) {

                    "code" -> parsedValues.code = p.text
                    "feilreferanse" -> parsedValues.feilreferanse = p.text
                    "httpStatus" -> parsedValues.httpStatus = p.text.toInt()
                    "message" -> parsedValues.message = p.text

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return SkefolkeregisterlesemodelluniversalfeilErrorMessageForExternalUsers(
                code = parsedValues.code,
                feilreferanse = parsedValues.feilreferanse,
                httpStatus = parsedValues.httpStatus,
                message = parsedValues.message,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

