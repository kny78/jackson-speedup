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
 * @param adresselinje 
 * @param postnummer 
 * @param poststedsnavn 
 * @param landkode 
 */

data class Folkeregisterettilgjengeliggjoeringhendelsev1KontaktadresseForDoedsbo (

    @field:JsonProperty("adresselinje")
    val adresselinje: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("postnummer")
    val postnummer: kotlin.String,

    @field:JsonProperty("poststedsnavn")
    val poststedsnavn: kotlin.String,

    @field:JsonProperty("landkode")
    val landkode: kotlin.String? = null

) {

    class ParsedValues{
        var adresselinje: List<kotlin.String>? = null
        var postnummer: kotlin.String? = null
        var poststedsnavn: kotlin.String? = null
        var landkode: kotlin.String? = null
    }

    @Suppress("UNUSED_VALUE")
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1KontaktadresseForDoedsbo>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1KontaktadresseForDoedsbo {
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
                    "postnummer" -> parsedValues.postnummer = p.text
                    "poststedsnavn" -> parsedValues.poststedsnavn = p.text

                    "landkode" -> parsedValues.landkode = p.text

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringhendelsev1KontaktadresseForDoedsbo(
                adresselinje = parsedValues.adresselinje!!,
                postnummer = parsedValues.postnummer!!,
                poststedsnavn = parsedValues.poststedsnavn!!,
                landkode = parsedValues.landkode,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

