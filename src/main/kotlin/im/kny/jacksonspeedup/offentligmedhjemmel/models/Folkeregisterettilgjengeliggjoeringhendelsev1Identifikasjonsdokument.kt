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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringhendelsev1TekniskDokumentkontroll

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.type.*


/**
 * 
 *
 * @param identifikasjonsdokumenttype 
 * @param utstederland 
 * @param aarsak 
 * @param ajourholdstidspunkt 
 * @param dokumentkontroll 
 * @param gyldigFra 
 * @param gyldigTil 
 * @param gyldighetstidspunkt 
 * @param identifikasjonsdokumentnummer 
 * @param kilde 
 * @param opphoerstidspunkt 
 * @param utstedernavn 
 */

data class Folkeregisterettilgjengeliggjoeringhendelsev1Identifikasjonsdokument (

    @field:JsonProperty("identifikasjonsdokumenttype")
    val identifikasjonsdokumenttype: kotlin.String,

    @field:JsonProperty("utstederland")
    val utstederland: kotlin.String,

    @field:JsonProperty("aarsak")
    val aarsak: kotlin.String? = null,

    @field:JsonProperty("ajourholdstidspunkt")
    val ajourholdstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("dokumentkontroll")
    val dokumentkontroll: Folkeregisterettilgjengeliggjoeringhendelsev1TekniskDokumentkontroll? = null,

    @field:JsonProperty("gyldigFra")
    val gyldigFra: java.time.LocalDate? = null,

    @field:JsonProperty("gyldigTil")
    val gyldigTil: java.time.LocalDate? = null,

    @field:JsonProperty("gyldighetstidspunkt")
    val gyldighetstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("identifikasjonsdokumentnummer")
    val identifikasjonsdokumentnummer: kotlin.String? = null,

    @field:JsonProperty("kilde")
    val kilde: kotlin.String? = null,

    @field:JsonProperty("opphoerstidspunkt")
    val opphoerstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("utstedernavn")
    val utstedernavn: kotlin.String? = null

) {

    class ParsedValues{
        var identifikasjonsdokumenttype: kotlin.String? = null
        var utstederland: kotlin.String? = null
        var aarsak: kotlin.String? = null
        var ajourholdstidspunkt: java.time.OffsetDateTime? = null
        var dokumentkontroll: Folkeregisterettilgjengeliggjoeringhendelsev1TekniskDokumentkontroll? = null
        var gyldigFra: java.time.LocalDate? = null
        var gyldigTil: java.time.LocalDate? = null
        var gyldighetstidspunkt: java.time.OffsetDateTime? = null
        var identifikasjonsdokumentnummer: kotlin.String? = null
        var kilde: kotlin.String? = null
        var opphoerstidspunkt: java.time.OffsetDateTime? = null
        var utstedernavn: kotlin.String? = null
    }
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1Identifikasjonsdokument>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1Identifikasjonsdokument {
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
                    "identifikasjonsdokumenttype" -> parsedValues.identifikasjonsdokumenttype = p.text
                    "utstederland" -> parsedValues.utstederland = p.text

                    "aarsak" -> parsedValues.aarsak = p.text
                    "ajourholdstidspunkt" -> parsedValues.ajourholdstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "dokumentkontroll" -> parsedValues.dokumentkontroll = Folkeregisterettilgjengeliggjoeringhendelsev1TekniskDokumentkontroll.deserializer.deserialize(p, ctx)
                    "gyldigFra" -> parsedValues.gyldigFra = java.time.LocalDate.parse(p.text)
                    "gyldigTil" -> parsedValues.gyldigTil = java.time.LocalDate.parse(p.text)
                    "gyldighetstidspunkt" -> parsedValues.gyldighetstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "identifikasjonsdokumentnummer" -> parsedValues.identifikasjonsdokumentnummer = p.text
                    "kilde" -> parsedValues.kilde = p.text
                    "opphoerstidspunkt" -> parsedValues.opphoerstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "utstedernavn" -> parsedValues.utstedernavn = p.text

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringhendelsev1Identifikasjonsdokument(
                identifikasjonsdokumenttype = parsedValues.identifikasjonsdokumenttype!!,
                utstederland = parsedValues.utstederland!!,
                aarsak = parsedValues.aarsak,
                ajourholdstidspunkt = parsedValues.ajourholdstidspunkt,
                dokumentkontroll = parsedValues.dokumentkontroll,
                gyldigFra = parsedValues.gyldigFra,
                gyldigTil = parsedValues.gyldigTil,
                gyldighetstidspunkt = parsedValues.gyldighetstidspunkt,
                identifikasjonsdokumentnummer = parsedValues.identifikasjonsdokumentnummer,
                kilde = parsedValues.kilde,
                opphoerstidspunkt = parsedValues.opphoerstidspunkt,
                utstedernavn = parsedValues.utstedernavn,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

