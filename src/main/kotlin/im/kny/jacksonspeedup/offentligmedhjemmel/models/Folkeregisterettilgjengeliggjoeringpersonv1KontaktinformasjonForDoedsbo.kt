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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1AdvokatSomKontakt
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1KontaktadresseForDoedsbo
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1OrganisasjonSomKontakt
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1PersonSomKontakt

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.type.*


/**
 * 
 *
 * @param adresse 
 * @param attestutstedelsesdato 
 * @param skifteform 
 * @param aarsak 
 * @param advokat 
 * @param ajourholdstidspunkt 
 * @param erGjeldende 
 * @param gyldighetstidspunkt 
 * @param kilde 
 * @param opphoerstidspunkt 
 * @param organisasjon 
 * @param person 
 */

data class Folkeregisterettilgjengeliggjoeringpersonv1KontaktinformasjonForDoedsbo (

    @field:JsonProperty("adresse")
    val adresse: Folkeregisterettilgjengeliggjoeringpersonv1KontaktadresseForDoedsbo,

    @field:JsonProperty("attestutstedelsesdato")
    val attestutstedelsesdato: java.time.LocalDate,

    @field:JsonProperty("skifteform")
    val skifteform: Folkeregisterettilgjengeliggjoeringpersonv1KontaktinformasjonForDoedsbo.Skifteform,

    @field:JsonProperty("aarsak")
    val aarsak: kotlin.String? = null,

    @field:JsonProperty("advokat")
    val advokat: Folkeregisterettilgjengeliggjoeringpersonv1AdvokatSomKontakt? = null,

    @field:JsonProperty("ajourholdstidspunkt")
    val ajourholdstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("erGjeldende")
    val erGjeldende: kotlin.Boolean? = null,

    @field:JsonProperty("gyldighetstidspunkt")
    val gyldighetstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("kilde")
    val kilde: kotlin.String? = null,

    @field:JsonProperty("opphoerstidspunkt")
    val opphoerstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("organisasjon")
    val organisasjon: Folkeregisterettilgjengeliggjoeringpersonv1OrganisasjonSomKontakt? = null,

    @field:JsonProperty("person")
    val person: Folkeregisterettilgjengeliggjoeringpersonv1PersonSomKontakt? = null

) {

    /**
     * 
     *
     * Values: offentlig,annet
     */
    enum class Skifteform(val value: kotlin.String) {
        @JsonProperty(value = "offentlig") offentlig("offentlig"),
        @JsonProperty(value = "annet") annet("annet");
    }
    class ParsedValues{
        var adresse: Folkeregisterettilgjengeliggjoeringpersonv1KontaktadresseForDoedsbo? = null
        var attestutstedelsesdato: java.time.LocalDate? = null
        var skifteform: Folkeregisterettilgjengeliggjoeringpersonv1KontaktinformasjonForDoedsbo.Skifteform? = null
        var aarsak: kotlin.String? = null
        var advokat: Folkeregisterettilgjengeliggjoeringpersonv1AdvokatSomKontakt? = null
        var ajourholdstidspunkt: java.time.OffsetDateTime? = null
        var erGjeldende: kotlin.Boolean? = null
        var gyldighetstidspunkt: java.time.OffsetDateTime? = null
        var kilde: kotlin.String? = null
        var opphoerstidspunkt: java.time.OffsetDateTime? = null
        var organisasjon: Folkeregisterettilgjengeliggjoeringpersonv1OrganisasjonSomKontakt? = null
        var person: Folkeregisterettilgjengeliggjoeringpersonv1PersonSomKontakt? = null
    }

    @Suppress("UNUSED_VALUE")
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringpersonv1KontaktinformasjonForDoedsbo>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringpersonv1KontaktinformasjonForDoedsbo {
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
                    "adresse" -> parsedValues.adresse = Folkeregisterettilgjengeliggjoeringpersonv1KontaktadresseForDoedsbo.deserializer.deserialize(p, ctx)
                    "attestutstedelsesdato" -> parsedValues.attestutstedelsesdato = java.time.LocalDate.parse(p.text)

                    "skifteform" -> parsedValues.skifteform = Folkeregisterettilgjengeliggjoeringpersonv1KontaktinformasjonForDoedsbo.Skifteform.valueOf(p.text)

                    "aarsak" -> parsedValues.aarsak = p.text
                    "advokat" -> parsedValues.advokat = Folkeregisterettilgjengeliggjoeringpersonv1AdvokatSomKontakt.deserializer.deserialize(p, ctx)
                    "ajourholdstidspunkt" -> parsedValues.ajourholdstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "erGjeldende" -> parsedValues.erGjeldende = p.text.toBoolean()
                    "gyldighetstidspunkt" -> parsedValues.gyldighetstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "kilde" -> parsedValues.kilde = p.text
                    "opphoerstidspunkt" -> parsedValues.opphoerstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "organisasjon" -> parsedValues.organisasjon = Folkeregisterettilgjengeliggjoeringpersonv1OrganisasjonSomKontakt.deserializer.deserialize(p, ctx)
                    "person" -> parsedValues.person = Folkeregisterettilgjengeliggjoeringpersonv1PersonSomKontakt.deserializer.deserialize(p, ctx)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringpersonv1KontaktinformasjonForDoedsbo(
                adresse = parsedValues.adresse!!,
                attestutstedelsesdato = parsedValues.attestutstedelsesdato!!,
                skifteform = parsedValues.skifteform!!,
                aarsak = parsedValues.aarsak,
                advokat = parsedValues.advokat,
                ajourholdstidspunkt = parsedValues.ajourholdstidspunkt,
                erGjeldende = parsedValues.erGjeldende,
                gyldighetstidspunkt = parsedValues.gyldighetstidspunkt,
                kilde = parsedValues.kilde,
                opphoerstidspunkt = parsedValues.opphoerstidspunkt,
                organisasjon = parsedValues.organisasjon,
                person = parsedValues.person,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

