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
import java.time.*
import java.time.format.*
/**
 * 
 * @param etternavn 
 * @param fornavn 
 * @param mellomnavn 
 */
data class Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn(
    @field:JsonProperty("etternavn")
    val etternavn: kotlin.String,
    @field:JsonProperty("fornavn")
    val fornavn: kotlin.String,
    @field:JsonProperty("mellomnavn")
    val mellomnavn: kotlin.String? = null
) 
{
    class ParsedValues{
        var etternavn: kotlin.String? = null
        var fornavn: kotlin.String? = null
        var mellomnavn: kotlin.String? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn {
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
                    "etternavn" -> parsedValues.etternavn = p.text
                    "fornavn" -> parsedValues.fornavn = p.text

                    "mellomnavn" -> parsedValues.mellomnavn = p.text

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn(
                etternavn = parsedValues.etternavn!!,
                fornavn = parsedValues.fornavn!!,
                mellomnavn = parsedValues.mellomnavn,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}
