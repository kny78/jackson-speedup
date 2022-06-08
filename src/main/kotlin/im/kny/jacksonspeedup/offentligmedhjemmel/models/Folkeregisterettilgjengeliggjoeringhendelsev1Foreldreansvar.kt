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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson


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
 * @param ansvar 
 * @param aarsak 
 * @param ajourholdstidspunkt 
 * @param ansvarlig 
 * @param ansvarligOrganisasjon 
 * @param ansvarligUtenIdentifikator 
 * @param ansvarssubjekt 
 * @param ansvarssubjektUtenIdentifikator 
 * @param gyldighetstidspunkt 
 * @param kilde 
 * @param opphoerstidspunkt 
 */
data class Folkeregisterettilgjengeliggjoeringhendelsev1Foreldreansvar(
    @field:JsonProperty("ansvar")
    val ansvar: Folkeregisterettilgjengeliggjoeringhendelsev1Foreldreansvar.Ansvar,
    @field:JsonProperty("aarsak")
    val aarsak: kotlin.String? = null,
    @field:JsonProperty("ajourholdstidspunkt")
    val ajourholdstidspunkt: java.time.OffsetDateTime? = null,
    @field:JsonProperty("ansvarlig")
    val ansvarlig: kotlin.String? = null,
    @field:JsonProperty("ansvarligOrganisasjon")
    val ansvarligOrganisasjon: kotlin.String? = null,
    @field:JsonProperty("ansvarligUtenIdentifikator")
    val ansvarligUtenIdentifikator: Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson? = null,
    @field:JsonProperty("ansvarssubjekt")
    val ansvarssubjekt: kotlin.String? = null,
    @field:JsonProperty("ansvarssubjektUtenIdentifikator")
    val ansvarssubjektUtenIdentifikator: Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson? = null,
    @field:JsonProperty("gyldighetstidspunkt")
    val gyldighetstidspunkt: java.time.OffsetDateTime? = null,
    @field:JsonProperty("kilde")
    val kilde: kotlin.String? = null,
    @field:JsonProperty("opphoerstidspunkt")
    val opphoerstidspunkt: java.time.OffsetDateTime? = null
) 
{
    /**
    * 
    * Values: felles,mor,far,medmor,andre,ukjent
    */
    enum class Ansvar(val value: kotlin.String){
        felles("felles"),
        mor("mor"),
        far("far"),
        medmor("medmor"),
        andre("andre"),
        ukjent("ukjent");
    }
    class ParsedValues{
        var ansvar: Folkeregisterettilgjengeliggjoeringhendelsev1Foreldreansvar.Ansvar? = null
        var aarsak: kotlin.String? = null
        var ajourholdstidspunkt: java.time.OffsetDateTime? = null
        var ansvarlig: kotlin.String? = null
        var ansvarligOrganisasjon: kotlin.String? = null
        var ansvarligUtenIdentifikator: Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson? = null
        var ansvarssubjekt: kotlin.String? = null
        var ansvarssubjektUtenIdentifikator: Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson? = null
        var gyldighetstidspunkt: java.time.OffsetDateTime? = null
        var kilde: kotlin.String? = null
        var opphoerstidspunkt: java.time.OffsetDateTime? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1Foreldreansvar>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1Foreldreansvar {
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

                    "ansvar" -> parsedValues.ansvar = Folkeregisterettilgjengeliggjoeringhendelsev1Foreldreansvar.Ansvar.valueOf(p.text)

                    "aarsak" -> parsedValues.aarsak = p.text
                    "ajourholdstidspunkt" -> parsedValues.ajourholdstidspunkt = OffsetDateTime.parse(p.text)
                    "ansvarlig" -> parsedValues.ansvarlig = p.text
                    "ansvarligOrganisasjon" -> parsedValues.ansvarligOrganisasjon = p.text
                    "ansvarligUtenIdentifikator" -> parsedValues.ansvarligUtenIdentifikator = Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson.deserializer.deserialize(p, ctx)
                    "ansvarssubjekt" -> parsedValues.ansvarssubjekt = p.text
                    "ansvarssubjektUtenIdentifikator" -> parsedValues.ansvarssubjektUtenIdentifikator = Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson.deserializer.deserialize(p, ctx)
                    "gyldighetstidspunkt" -> parsedValues.gyldighetstidspunkt = OffsetDateTime.parse(p.text)
                    "kilde" -> parsedValues.kilde = p.text
                    "opphoerstidspunkt" -> parsedValues.opphoerstidspunkt = OffsetDateTime.parse(p.text)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringhendelsev1Foreldreansvar(
                ansvar = parsedValues.ansvar!!,
                aarsak = parsedValues.aarsak,
                ajourholdstidspunkt = parsedValues.ajourholdstidspunkt,
                ansvarlig = parsedValues.ansvarlig,
                ansvarligOrganisasjon = parsedValues.ansvarligOrganisasjon,
                ansvarligUtenIdentifikator = parsedValues.ansvarligUtenIdentifikator,
                ansvarssubjekt = parsedValues.ansvarssubjekt,
                ansvarssubjektUtenIdentifikator = parsedValues.ansvarssubjektUtenIdentifikator,
                gyldighetstidspunkt = parsedValues.gyldighetstidspunkt,
                kilde = parsedValues.kilde,
                opphoerstidspunkt = parsedValues.opphoerstidspunkt,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}
