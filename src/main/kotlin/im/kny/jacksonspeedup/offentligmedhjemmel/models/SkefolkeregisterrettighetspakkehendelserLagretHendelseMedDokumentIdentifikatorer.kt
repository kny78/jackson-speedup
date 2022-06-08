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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.SkefolkeregisterrettighetspakkehendelserHendelseMedDokumentIdentifikatorer


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
 * @param hendelse 
 * @param sekvensnummer 
 */
data class SkefolkeregisterrettighetspakkehendelserLagretHendelseMedDokumentIdentifikatorer(
    @field:JsonProperty("hendelse")
    val hendelse: SkefolkeregisterrettighetspakkehendelserHendelseMedDokumentIdentifikatorer? = null,
    @field:JsonProperty("sekvensnummer")
    val sekvensnummer: kotlin.Long? = null
) 
{
    class ParsedValues{
        var hendelse: SkefolkeregisterrettighetspakkehendelserHendelseMedDokumentIdentifikatorer? = null
        var sekvensnummer: kotlin.Long? = null
    }

    class Deserializer : JsonDeserializer<SkefolkeregisterrettighetspakkehendelserLagretHendelseMedDokumentIdentifikatorer>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): SkefolkeregisterrettighetspakkehendelserLagretHendelseMedDokumentIdentifikatorer {
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

                    "hendelse" -> parsedValues.hendelse = SkefolkeregisterrettighetspakkehendelserHendelseMedDokumentIdentifikatorer.deserializer.deserialize(p, ctx)
                    "sekvensnummer" -> parsedValues.sekvensnummer = p.text.toLong()

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return SkefolkeregisterrettighetspakkehendelserLagretHendelseMedDokumentIdentifikatorer(
                hendelse = parsedValues.hendelse,
                sekvensnummer = parsedValues.sekvensnummer,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}