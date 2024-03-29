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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringhendelsev1InternasjonalAdresse
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringhendelsev1Matrikkeladresse
import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringhendelsev1Vegadresse

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.type.*


/**
 * 
 *
 * @param adressegradering 
 * @param aarsak 
 * @param adresseIdentifikatorFraMatrikkelen 
 * @param adressenErUkjent 
 * @param ajourholdstidspunkt 
 * @param gyldighetstidspunkt 
 * @param kilde 
 * @param matrikkeladresse 
 * @param opphoerstidspunkt 
 * @param oppholdAnnetSted 
 * @param oppholdsadressedato 
 * @param utenlandskAdresse 
 * @param vegadresse 
 */

data class Folkeregisterettilgjengeliggjoeringhendelsev1Oppholdsadresse (

    @field:JsonProperty("adressegradering")
    val adressegradering: Folkeregisterettilgjengeliggjoeringhendelsev1Oppholdsadresse.Adressegradering,

    @field:JsonProperty("aarsak")
    val aarsak: kotlin.String? = null,

    @field:JsonProperty("adresseIdentifikatorFraMatrikkelen")
    val adresseIdentifikatorFraMatrikkelen: kotlin.String? = null,

    @field:JsonProperty("adressenErUkjent")
    val adressenErUkjent: kotlin.Boolean? = null,

    @field:JsonProperty("ajourholdstidspunkt")
    val ajourholdstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("gyldighetstidspunkt")
    val gyldighetstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("kilde")
    val kilde: kotlin.String? = null,

    @field:JsonProperty("matrikkeladresse")
    val matrikkeladresse: Folkeregisterettilgjengeliggjoeringhendelsev1Matrikkeladresse? = null,

    @field:JsonProperty("opphoerstidspunkt")
    val opphoerstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("oppholdAnnetSted")
    val oppholdAnnetSted: Folkeregisterettilgjengeliggjoeringhendelsev1Oppholdsadresse.OppholdAnnetSted? = null,

    @field:JsonProperty("oppholdsadressedato")
    val oppholdsadressedato: java.time.LocalDate? = null,

    @field:JsonProperty("utenlandskAdresse")
    val utenlandskAdresse: Folkeregisterettilgjengeliggjoeringhendelsev1InternasjonalAdresse? = null,

    @field:JsonProperty("vegadresse")
    val vegadresse: Folkeregisterettilgjengeliggjoeringhendelsev1Vegadresse? = null

) {

    /**
     * 
     *
     * Values: ugradert,klientadresse,fortrolig,strengtFortrolig
     */
    enum class Adressegradering(val value: kotlin.String) {
        @JsonProperty(value = "ugradert") ugradert("ugradert"),
        @JsonProperty(value = "klientadresse") klientadresse("klientadresse"),
        @JsonProperty(value = "fortrolig") fortrolig("fortrolig"),
        @JsonProperty(value = "strengtFortrolig") strengtFortrolig("strengtFortrolig");
    }
    /**
     * 
     *
     * Values: militaer,utenriks,paaSvalbard,pendler
     */
    enum class OppholdAnnetSted(val value: kotlin.String) {
        @JsonProperty(value = "militaer") militaer("militaer"),
        @JsonProperty(value = "utenriks") utenriks("utenriks"),
        @JsonProperty(value = "paaSvalbard") paaSvalbard("paaSvalbard"),
        @JsonProperty(value = "pendler") pendler("pendler");
    }
    class ParsedValues{
        var adressegradering: Folkeregisterettilgjengeliggjoeringhendelsev1Oppholdsadresse.Adressegradering? = null
        var aarsak: kotlin.String? = null
        var adresseIdentifikatorFraMatrikkelen: kotlin.String? = null
        var adressenErUkjent: kotlin.Boolean? = null
        var ajourholdstidspunkt: java.time.OffsetDateTime? = null
        var gyldighetstidspunkt: java.time.OffsetDateTime? = null
        var kilde: kotlin.String? = null
        var matrikkeladresse: Folkeregisterettilgjengeliggjoeringhendelsev1Matrikkeladresse? = null
        var opphoerstidspunkt: java.time.OffsetDateTime? = null
        var oppholdAnnetSted: Folkeregisterettilgjengeliggjoeringhendelsev1Oppholdsadresse.OppholdAnnetSted? = null
        var oppholdsadressedato: java.time.LocalDate? = null
        var utenlandskAdresse: Folkeregisterettilgjengeliggjoeringhendelsev1InternasjonalAdresse? = null
        var vegadresse: Folkeregisterettilgjengeliggjoeringhendelsev1Vegadresse? = null
    }

    @Suppress("UNUSED_VALUE")
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1Oppholdsadresse>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1Oppholdsadresse {
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

                    "adressegradering" -> parsedValues.adressegradering = Folkeregisterettilgjengeliggjoeringhendelsev1Oppholdsadresse.Adressegradering.valueOf(p.text)

                    "aarsak" -> parsedValues.aarsak = p.text
                    "adresseIdentifikatorFraMatrikkelen" -> parsedValues.adresseIdentifikatorFraMatrikkelen = p.text
                    "adressenErUkjent" -> parsedValues.adressenErUkjent = p.text.toBoolean()
                    "ajourholdstidspunkt" -> parsedValues.ajourholdstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "gyldighetstidspunkt" -> parsedValues.gyldighetstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "kilde" -> parsedValues.kilde = p.text
                    "matrikkeladresse" -> parsedValues.matrikkeladresse = Folkeregisterettilgjengeliggjoeringhendelsev1Matrikkeladresse.deserializer.deserialize(p, ctx)
                    "opphoerstidspunkt" -> parsedValues.opphoerstidspunkt = java.time.OffsetDateTime.parse(p.text)

                    "oppholdAnnetSted" -> parsedValues.oppholdAnnetSted = Folkeregisterettilgjengeliggjoeringhendelsev1Oppholdsadresse.OppholdAnnetSted.valueOf(p.text)
                    "oppholdsadressedato" -> parsedValues.oppholdsadressedato = java.time.LocalDate.parse(p.text)
                    "utenlandskAdresse" -> parsedValues.utenlandskAdresse = Folkeregisterettilgjengeliggjoeringhendelsev1InternasjonalAdresse.deserializer.deserialize(p, ctx)
                    "vegadresse" -> parsedValues.vegadresse = Folkeregisterettilgjengeliggjoeringhendelsev1Vegadresse.deserializer.deserialize(p, ctx)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringhendelsev1Oppholdsadresse(
                adressegradering = parsedValues.adressegradering!!,
                aarsak = parsedValues.aarsak,
                adresseIdentifikatorFraMatrikkelen = parsedValues.adresseIdentifikatorFraMatrikkelen,
                adressenErUkjent = parsedValues.adressenErUkjent,
                ajourholdstidspunkt = parsedValues.ajourholdstidspunkt,
                gyldighetstidspunkt = parsedValues.gyldighetstidspunkt,
                kilde = parsedValues.kilde,
                matrikkeladresse = parsedValues.matrikkeladresse,
                opphoerstidspunkt = parsedValues.opphoerstidspunkt,
                oppholdAnnetSted = parsedValues.oppholdAnnetSted,
                oppholdsadressedato = parsedValues.oppholdsadressedato,
                utenlandskAdresse = parsedValues.utenlandskAdresse,
                vegadresse = parsedValues.vegadresse,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

