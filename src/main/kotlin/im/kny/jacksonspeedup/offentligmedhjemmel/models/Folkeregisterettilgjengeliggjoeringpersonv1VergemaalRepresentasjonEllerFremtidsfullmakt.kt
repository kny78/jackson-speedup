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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig


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
 * @param verge 
 * @param aarsak 
 * @param ajourholdstidspunkt 
 * @param embete 
 * @param erGjeldende 
 * @param gyldighetstidspunkt 
 * @param kilde 
 * @param opphoerstidspunkt 
 * @param vergemaaltype 
 */
data class Folkeregisterettilgjengeliggjoeringpersonv1VergemaalRepresentasjonEllerFremtidsfullmakt(
    @field:JsonProperty("verge")
    val verge: Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig,
    @field:JsonProperty("aarsak")
    val aarsak: kotlin.String? = null,
    @field:JsonProperty("ajourholdstidspunkt")
    val ajourholdstidspunkt: java.time.OffsetDateTime? = null,
    @field:JsonProperty("embete")
    val embete: kotlin.String? = null,
    @field:JsonProperty("erGjeldende")
    val erGjeldende: kotlin.Boolean? = null,
    @field:JsonProperty("gyldighetstidspunkt")
    val gyldighetstidspunkt: java.time.OffsetDateTime? = null,
    @field:JsonProperty("kilde")
    val kilde: kotlin.String? = null,
    @field:JsonProperty("opphoerstidspunkt")
    val opphoerstidspunkt: java.time.OffsetDateTime? = null,
    @field:JsonProperty("vergemaaltype")
    val vergemaaltype: Folkeregisterettilgjengeliggjoeringpersonv1VergemaalRepresentasjonEllerFremtidsfullmakt.Vergemaaltype? = null
) 
{
    /**
    * 
    * Values: ensligMindreaarigAsylsoeker,ensligMindreaarigFlyktning,voksen,midlertidigForVoksen,mindreaarig,midlertidigForMindreaarig,forvaltningUtenforVergemaal,stadfestetFremtidsfullmakt
    */
    enum class Vergemaaltype(val value: kotlin.String){
        ensligMindreaarigAsylsoeker("ensligMindreaarigAsylsoeker"),
        ensligMindreaarigFlyktning("ensligMindreaarigFlyktning"),
        voksen("voksen"),
        midlertidigForVoksen("midlertidigForVoksen"),
        mindreaarig("mindreaarig"),
        midlertidigForMindreaarig("midlertidigForMindreaarig"),
        forvaltningUtenforVergemaal("forvaltningUtenforVergemaal"),
        stadfestetFremtidsfullmakt("stadfestetFremtidsfullmakt");
    }
    class ParsedValues{
        var verge: Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig? = null
        var aarsak: kotlin.String? = null
        var ajourholdstidspunkt: java.time.OffsetDateTime? = null
        var embete: kotlin.String? = null
        var erGjeldende: kotlin.Boolean? = null
        var gyldighetstidspunkt: java.time.OffsetDateTime? = null
        var kilde: kotlin.String? = null
        var opphoerstidspunkt: java.time.OffsetDateTime? = null
        var vergemaaltype: Folkeregisterettilgjengeliggjoeringpersonv1VergemaalRepresentasjonEllerFremtidsfullmakt.Vergemaaltype? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringpersonv1VergemaalRepresentasjonEllerFremtidsfullmakt>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringpersonv1VergemaalRepresentasjonEllerFremtidsfullmakt {
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
                    "verge" -> parsedValues.verge = Folkeregisterettilgjengeliggjoeringpersonv1VergeRepresentantEllerFullmektig.deserializer.deserialize(p, ctx)

                    "aarsak" -> parsedValues.aarsak = p.text
                    "ajourholdstidspunkt" -> parsedValues.ajourholdstidspunkt = OffsetDateTime.parse(p.text)
                    "embete" -> parsedValues.embete = p.text
                    "erGjeldende" -> parsedValues.erGjeldende = p.text.toBoolean()
                    "gyldighetstidspunkt" -> parsedValues.gyldighetstidspunkt = OffsetDateTime.parse(p.text)
                    "kilde" -> parsedValues.kilde = p.text
                    "opphoerstidspunkt" -> parsedValues.opphoerstidspunkt = OffsetDateTime.parse(p.text)

                    "vergemaaltype" -> parsedValues.vergemaaltype = Folkeregisterettilgjengeliggjoeringpersonv1VergemaalRepresentasjonEllerFremtidsfullmakt.Vergemaaltype.valueOf(p.text)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringpersonv1VergemaalRepresentasjonEllerFremtidsfullmakt(
                verge = parsedValues.verge!!,
                aarsak = parsedValues.aarsak,
                ajourholdstidspunkt = parsedValues.ajourholdstidspunkt,
                embete = parsedValues.embete,
                erGjeldende = parsedValues.erGjeldende,
                gyldighetstidspunkt = parsedValues.gyldighetstidspunkt,
                kilde = parsedValues.kilde,
                opphoerstidspunkt = parsedValues.opphoerstidspunkt,
                vergemaaltype = parsedValues.vergemaaltype,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}
