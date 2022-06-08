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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringhendelsev1Poststed


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
 * @param adresselinje 
 * @param poststed 
 */
data class Folkeregisterettilgjengeliggjoeringhendelsev1PostadresseIFrittFormat(
    @field:JsonProperty("adresselinje")
    val adresselinje: kotlin.collections.List<kotlin.String>? = null,
    @field:JsonProperty("poststed")
    val poststed: Folkeregisterettilgjengeliggjoeringhendelsev1Poststed? = null
) 
{
    class ParsedValues{
        var adresselinje: List<kotlin.String>? = null
        var poststed: Folkeregisterettilgjengeliggjoeringhendelsev1Poststed? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1PostadresseIFrittFormat>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1PostadresseIFrittFormat {
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

                    "adresselinje" -> {
                        val list : ArrayList<String> = ArrayList()
                        while(p.nextToken() != JsonToken.END_ARRAY) {
                            list.add(p.text)
                        }
                        parsedValues.adresselinje = list
                      }
                    "poststed" -> parsedValues.poststed = Folkeregisterettilgjengeliggjoeringhendelsev1Poststed.deserializer.deserialize(p, ctx)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringhendelsev1PostadresseIFrittFormat(
                adresselinje = parsedValues.adresselinje,
                poststed = parsedValues.poststed,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}
