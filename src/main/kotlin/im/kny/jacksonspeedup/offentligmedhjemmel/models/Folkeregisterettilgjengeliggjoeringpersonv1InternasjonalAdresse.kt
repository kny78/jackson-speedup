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
 * @param landkode 
 * @param adressenavn 
 * @param boenhet 
 * @param byEllerStedsnavn 
 * @param bygning 
 * @param coAdressenavn 
 * @param distriktsnavn 
 * @param etasjenummer 
 * @param postboks 
 * @param postkode 
 * @param region 
 */

data class Folkeregisterettilgjengeliggjoeringpersonv1InternasjonalAdresse (

    @field:JsonProperty("landkode")
    val landkode: kotlin.String,

    @field:JsonProperty("adressenavn")
    val adressenavn: kotlin.String? = null,

    @field:JsonProperty("boenhet")
    val boenhet: kotlin.String? = null,

    @field:JsonProperty("byEllerStedsnavn")
    val byEllerStedsnavn: kotlin.String? = null,

    @field:JsonProperty("bygning")
    val bygning: kotlin.String? = null,

    @field:JsonProperty("coAdressenavn")
    val coAdressenavn: kotlin.String? = null,

    @field:JsonProperty("distriktsnavn")
    val distriktsnavn: kotlin.String? = null,

    @field:JsonProperty("etasjenummer")
    val etasjenummer: kotlin.String? = null,

    @field:JsonProperty("postboks")
    val postboks: kotlin.String? = null,

    @field:JsonProperty("postkode")
    val postkode: kotlin.String? = null,

    @field:JsonProperty("region")
    val region: kotlin.String? = null

) {

    class ParsedValues{
        var landkode: kotlin.String? = null
        var adressenavn: kotlin.String? = null
        var boenhet: kotlin.String? = null
        var byEllerStedsnavn: kotlin.String? = null
        var bygning: kotlin.String? = null
        var coAdressenavn: kotlin.String? = null
        var distriktsnavn: kotlin.String? = null
        var etasjenummer: kotlin.String? = null
        var postboks: kotlin.String? = null
        var postkode: kotlin.String? = null
        var region: kotlin.String? = null
    }
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringpersonv1InternasjonalAdresse>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringpersonv1InternasjonalAdresse {
            val parsedValues = ParsedValues()
            var curr = p.currentToken
            if (curr != JsonToken.START_OBJECT) {
                throw IllegalStateException("Should be start object")
            }
            curr = p.nextToken()
            while (curr == JsonToken.FIELD_NAME) {
                val field = p.text
                p.nextToken()
                when (field) {
                    "landkode" -> parsedValues.landkode = p.text

                    "adressenavn" -> parsedValues.adressenavn = p.text
                    "boenhet" -> parsedValues.boenhet = p.text
                    "byEllerStedsnavn" -> parsedValues.byEllerStedsnavn = p.text
                    "bygning" -> parsedValues.bygning = p.text
                    "coAdressenavn" -> parsedValues.coAdressenavn = p.text
                    "distriktsnavn" -> parsedValues.distriktsnavn = p.text
                    "etasjenummer" -> parsedValues.etasjenummer = p.text
                    "postboks" -> parsedValues.postboks = p.text
                    "postkode" -> parsedValues.postkode = p.text
                    "region" -> parsedValues.region = p.text

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringpersonv1InternasjonalAdresse(
                landkode = parsedValues.landkode!!,
                adressenavn = parsedValues.adressenavn,
                boenhet = parsedValues.boenhet,
                byEllerStedsnavn = parsedValues.byEllerStedsnavn,
                bygning = parsedValues.bygning,
                coAdressenavn = parsedValues.coAdressenavn,
                distriktsnavn = parsedValues.distriktsnavn,
                etasjenummer = parsedValues.etasjenummer,
                postboks = parsedValues.postboks,
                postkode = parsedValues.postkode,
                region = parsedValues.region,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

