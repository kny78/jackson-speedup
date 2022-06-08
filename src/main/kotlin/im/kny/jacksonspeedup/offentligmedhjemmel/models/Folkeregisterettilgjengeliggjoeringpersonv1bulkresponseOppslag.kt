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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseFeilmelding


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
 * @param foedselsEllerDNummer 
 * @param feilmelding 
 * @param folkeregisterperson 
 */
data class Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseOppslag(
    @field:JsonProperty("foedselsEllerDNummer")
    val foedselsEllerDNummer: kotlin.String,
    @field:JsonProperty("feilmelding")
    val feilmelding: Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseFeilmelding? = null,
    @field:JsonProperty("folkeregisterperson")
    val folkeregisterperson: Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson? = null
) 
{
    class ParsedValues{
        var foedselsEllerDNummer: kotlin.String? = null
        var feilmelding: Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseFeilmelding? = null
        var folkeregisterperson: Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseOppslag>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseOppslag {
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
                    "foedselsEllerDNummer" -> parsedValues.foedselsEllerDNummer = p.text

                    "feilmelding" -> parsedValues.feilmelding = Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseFeilmelding.deserializer.deserialize(p, ctx)
                    "folkeregisterperson" -> parsedValues.folkeregisterperson = Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterperson.deserializer.deserialize(p, ctx)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringpersonv1bulkresponseOppslag(
                foedselsEllerDNummer = parsedValues.foedselsEllerDNummer!!,
                feilmelding = parsedValues.feilmelding,
                folkeregisterperson = parsedValues.folkeregisterperson,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}