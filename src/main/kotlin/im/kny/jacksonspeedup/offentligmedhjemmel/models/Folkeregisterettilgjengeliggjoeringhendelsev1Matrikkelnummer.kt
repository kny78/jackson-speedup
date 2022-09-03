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
 * @param kommunenummer 
 * @param bruksnummer 
 * @param festenummer 
 * @param gaardsnummer 
 */

data class Folkeregisterettilgjengeliggjoeringhendelsev1Matrikkelnummer (

    @field:JsonProperty("kommunenummer")
    val kommunenummer: kotlin.String,

    @field:JsonProperty("bruksnummer")
    val bruksnummer: kotlin.Long? = null,

    @field:JsonProperty("festenummer")
    val festenummer: kotlin.Long? = null,

    @field:JsonProperty("gaardsnummer")
    val gaardsnummer: kotlin.Long? = null

) {

    class ParsedValues{
        var kommunenummer: kotlin.String? = null
        var bruksnummer: kotlin.Long? = null
        var festenummer: kotlin.Long? = null
        var gaardsnummer: kotlin.Long? = null
    }

    @Suppress("UNUSED_VALUE")
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1Matrikkelnummer>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1Matrikkelnummer {
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
                    "kommunenummer" -> parsedValues.kommunenummer = p.text

                    "bruksnummer" -> parsedValues.bruksnummer = p.text.toLong()
                    "festenummer" -> parsedValues.festenummer = p.text.toLong()
                    "gaardsnummer" -> parsedValues.gaardsnummer = p.text.toLong()

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringhendelsev1Matrikkelnummer(
                kommunenummer = parsedValues.kommunenummer!!,
                bruksnummer = parsedValues.bruksnummer,
                festenummer = parsedValues.festenummer,
                gaardsnummer = parsedValues.gaardsnummer,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

