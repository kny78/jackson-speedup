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
 * @param sivilstand 
 * @param aarsak 
 * @param ajourholdstidspunkt 
 * @param gyldighetstidspunkt 
 * @param kilde 
 * @param kommune 
 * @param myndighet 
 * @param opphoerstidspunkt 
 * @param relatertVedSivilstand 
 * @param sivilstandsdato 
 * @param sted 
 * @param utland 
 */

data class Folkeregisterettilgjengeliggjoeringhendelsev1Sivilstand (

    @field:JsonProperty("sivilstand")
    val sivilstand: Folkeregisterettilgjengeliggjoeringhendelsev1Sivilstand.Sivilstand,

    @field:JsonProperty("aarsak")
    val aarsak: kotlin.String? = null,

    @field:JsonProperty("ajourholdstidspunkt")
    val ajourholdstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("gyldighetstidspunkt")
    val gyldighetstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("kilde")
    val kilde: kotlin.String? = null,

    @field:JsonProperty("kommune")
    val kommune: kotlin.String? = null,

    @field:JsonProperty("myndighet")
    val myndighet: kotlin.String? = null,

    @field:JsonProperty("opphoerstidspunkt")
    val opphoerstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("relatertVedSivilstand")
    val relatertVedSivilstand: kotlin.String? = null,

    @field:JsonProperty("sivilstandsdato")
    val sivilstandsdato: java.time.LocalDate? = null,

    @field:JsonProperty("sted")
    val sted: kotlin.String? = null,

    @field:JsonProperty("utland")
    val utland: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: uoppgitt,ugift,gift,enkeEllerEnkemann,skilt,separert,registrertPartner,separertPartner,skiltPartner,gjenlevendePartner
     */
    enum class Sivilstand(val value: kotlin.String) {
        @JsonProperty(value = "uoppgitt") uoppgitt("uoppgitt"),
        @JsonProperty(value = "ugift") ugift("ugift"),
        @JsonProperty(value = "gift") gift("gift"),
        @JsonProperty(value = "enkeEllerEnkemann") enkeEllerEnkemann("enkeEllerEnkemann"),
        @JsonProperty(value = "skilt") skilt("skilt"),
        @JsonProperty(value = "separert") separert("separert"),
        @JsonProperty(value = "registrertPartner") registrertPartner("registrertPartner"),
        @JsonProperty(value = "separertPartner") separertPartner("separertPartner"),
        @JsonProperty(value = "skiltPartner") skiltPartner("skiltPartner"),
        @JsonProperty(value = "gjenlevendePartner") gjenlevendePartner("gjenlevendePartner");
    }
    class ParsedValues{
        var sivilstand: Folkeregisterettilgjengeliggjoeringhendelsev1Sivilstand.Sivilstand? = null
        var aarsak: kotlin.String? = null
        var ajourholdstidspunkt: java.time.OffsetDateTime? = null
        var gyldighetstidspunkt: java.time.OffsetDateTime? = null
        var kilde: kotlin.String? = null
        var kommune: kotlin.String? = null
        var myndighet: kotlin.String? = null
        var opphoerstidspunkt: java.time.OffsetDateTime? = null
        var relatertVedSivilstand: kotlin.String? = null
        var sivilstandsdato: java.time.LocalDate? = null
        var sted: kotlin.String? = null
        var utland: kotlin.String? = null
    }

    @Suppress("UNUSED_VALUE")
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1Sivilstand>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1Sivilstand {
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

                    "sivilstand" -> parsedValues.sivilstand = Folkeregisterettilgjengeliggjoeringhendelsev1Sivilstand.Sivilstand.valueOf(p.text)

                    "aarsak" -> parsedValues.aarsak = p.text
                    "ajourholdstidspunkt" -> parsedValues.ajourholdstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "gyldighetstidspunkt" -> parsedValues.gyldighetstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "kilde" -> parsedValues.kilde = p.text
                    "kommune" -> parsedValues.kommune = p.text
                    "myndighet" -> parsedValues.myndighet = p.text
                    "opphoerstidspunkt" -> parsedValues.opphoerstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "relatertVedSivilstand" -> parsedValues.relatertVedSivilstand = p.text
                    "sivilstandsdato" -> parsedValues.sivilstandsdato = java.time.LocalDate.parse(p.text)
                    "sted" -> parsedValues.sted = p.text
                    "utland" -> parsedValues.utland = p.text

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringhendelsev1Sivilstand(
                sivilstand = parsedValues.sivilstand!!,
                aarsak = parsedValues.aarsak,
                ajourholdstidspunkt = parsedValues.ajourholdstidspunkt,
                gyldighetstidspunkt = parsedValues.gyldighetstidspunkt,
                kilde = parsedValues.kilde,
                kommune = parsedValues.kommune,
                myndighet = parsedValues.myndighet,
                opphoerstidspunkt = parsedValues.opphoerstidspunkt,
                relatertVedSivilstand = parsedValues.relatertVedSivilstand,
                sivilstandsdato = parsedValues.sivilstandsdato,
                sted = parsedValues.sted,
                utland = parsedValues.utland,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

