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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1Personnavn


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
 * @param navn 
 * @param omfang 
 * @param omfangetErInnenPersonligOmraade 
 */
data class Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig(
    @field:JsonProperty("foedselsEllerDNummer")
    val foedselsEllerDNummer: kotlin.String? = null,
    @field:JsonProperty("navn")
    val navn: Folkeregisterettilgjengeliggjoeringpersonv1Personnavn? = null,
    @field:JsonProperty("omfang")
    val omfang: Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig.Omfang? = null,
    @field:JsonProperty("omfangetErInnenPersonligOmraade")
    val omfangetErInnenPersonligOmraade: kotlin.Boolean? = null
) 
{
    /**
    * 
    * Values: utlendingssakerPersonligeOgOekonomiskeInteresser,personligeOgOekonomiskeInteresser,oekonomiskeInteresser,personligeInteresser
    */
    enum class Omfang(val value: kotlin.String){
        utlendingssakerPersonligeOgOekonomiskeInteresser("utlendingssakerPersonligeOgOekonomiskeInteresser"),
        personligeOgOekonomiskeInteresser("personligeOgOekonomiskeInteresser"),
        oekonomiskeInteresser("oekonomiskeInteresser"),
        personligeInteresser("personligeInteresser");
    }
    class ParsedValues{
        var foedselsEllerDNummer: kotlin.String? = null
        var navn: Folkeregisterettilgjengeliggjoeringpersonv1Personnavn? = null
        var omfang: Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig.Omfang? = null
        var omfangetErInnenPersonligOmraade: kotlin.Boolean? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig {
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
                    "navn" -> parsedValues.navn = Folkeregisterettilgjengeliggjoeringpersonv1Personnavn.deserializer.deserialize(p, ctx)

                    "omfang" -> parsedValues.omfang = Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig.Omfang.valueOf(p.text)
                    "omfangetErInnenPersonligOmraade" -> parsedValues.omfangetErInnenPersonligOmraade = p.text.toBoolean()

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig(
                foedselsEllerDNummer = parsedValues.foedselsEllerDNummer,
                navn = parsedValues.navn,
                omfang = parsedValues.omfang,
                omfangetErInnenPersonligOmraade = parsedValues.omfangetErInnenPersonligOmraade,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}