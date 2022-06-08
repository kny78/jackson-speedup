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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseOppslag


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
 * @param oppslag 
 */
data class Folkeregisterettilgjengeliggjoeringpersonv1bulkresponsePersonBulkoppslagResponse(
    @field:JsonProperty("oppslag")
    val oppslag: kotlin.collections.List<Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseOppslag>? = null
) 
{
    class ParsedValues{
        var oppslag: List<Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseOppslag>? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringpersonv1bulkresponsePersonBulkoppslagResponse>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringpersonv1bulkresponsePersonBulkoppslagResponse {
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

                    "oppslag" -> {
                        val list : ArrayList<Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseOppslag> = ArrayList()
                        while(p.nextToken() != JsonToken.END_ARRAY) {
                            list.add(Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseOppslag.deserializer.deserialize(p, ctx))
                        }
                        parsedValues.oppslag = list
                      }

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringpersonv1bulkresponsePersonBulkoppslagResponse(
                oppslag = parsedValues.oppslag,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}