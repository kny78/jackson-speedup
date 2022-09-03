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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1AdresseIFrittFormat

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.type.*


/**
 * 
 *
 * @param valg 
 * @param aarsak 
 * @param adressegradering 
 * @param ajourholdstidspunkt 
 * @param erGjeldende 
 * @param gyldighetstidspunkt 
 * @param kilde 
 * @param kontaktadresseIFrittFormat 
 * @param opphoerstidspunkt 
 */

data class Folkeregisterettilgjengeliggjoeringpersonv1PreferertKontaktadresse (

    @field:JsonProperty("valg")
    val valg: Folkeregisterettilgjengeliggjoeringpersonv1PreferertKontaktadresse.Valg,

    @field:JsonProperty("aarsak")
    val aarsak: kotlin.String? = null,

    @field:JsonProperty("adressegradering")
    val adressegradering: Folkeregisterettilgjengeliggjoeringpersonv1PreferertKontaktadresse.Adressegradering? = null,

    @field:JsonProperty("ajourholdstidspunkt")
    val ajourholdstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("erGjeldende")
    val erGjeldende: kotlin.Boolean? = null,

    @field:JsonProperty("gyldighetstidspunkt")
    val gyldighetstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("kilde")
    val kilde: kotlin.String? = null,

    @field:JsonProperty("kontaktadresseIFrittFormat")
    val kontaktadresseIFrittFormat: Folkeregisterettilgjengeliggjoeringpersonv1AdresseIFrittFormat? = null,

    @field:JsonProperty("opphoerstidspunkt")
    val opphoerstidspunkt: java.time.OffsetDateTime? = null

) {

    /**
     * 
     *
     * Values: bostedsadresse,oppholdsadresse,postadresse,postadresseIUtlandet
     */
    enum class Valg(val value: kotlin.String) {
        @JsonProperty(value = "bostedsadresse") bostedsadresse("bostedsadresse"),
        @JsonProperty(value = "oppholdsadresse") oppholdsadresse("oppholdsadresse"),
        @JsonProperty(value = "postadresse") postadresse("postadresse"),
        @JsonProperty(value = "postadresseIUtlandet") postadresseIUtlandet("postadresseIUtlandet");
    }
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
    class ParsedValues{
        var valg: Folkeregisterettilgjengeliggjoeringpersonv1PreferertKontaktadresse.Valg? = null
        var aarsak: kotlin.String? = null
        var adressegradering: Folkeregisterettilgjengeliggjoeringpersonv1PreferertKontaktadresse.Adressegradering? = null
        var ajourholdstidspunkt: java.time.OffsetDateTime? = null
        var erGjeldende: kotlin.Boolean? = null
        var gyldighetstidspunkt: java.time.OffsetDateTime? = null
        var kilde: kotlin.String? = null
        var kontaktadresseIFrittFormat: Folkeregisterettilgjengeliggjoeringpersonv1AdresseIFrittFormat? = null
        var opphoerstidspunkt: java.time.OffsetDateTime? = null
    }

    @Suppress("UNUSED_VALUE")
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringpersonv1PreferertKontaktadresse>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringpersonv1PreferertKontaktadresse {
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

                    "valg" -> parsedValues.valg = Folkeregisterettilgjengeliggjoeringpersonv1PreferertKontaktadresse.Valg.valueOf(p.text)

                    "aarsak" -> parsedValues.aarsak = p.text

                    "adressegradering" -> parsedValues.adressegradering = Folkeregisterettilgjengeliggjoeringpersonv1PreferertKontaktadresse.Adressegradering.valueOf(p.text)
                    "ajourholdstidspunkt" -> parsedValues.ajourholdstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "erGjeldende" -> parsedValues.erGjeldende = p.text.toBoolean()
                    "gyldighetstidspunkt" -> parsedValues.gyldighetstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "kilde" -> parsedValues.kilde = p.text
                    "kontaktadresseIFrittFormat" -> parsedValues.kontaktadresseIFrittFormat = Folkeregisterettilgjengeliggjoeringpersonv1AdresseIFrittFormat.deserializer.deserialize(p, ctx)
                    "opphoerstidspunkt" -> parsedValues.opphoerstidspunkt = java.time.OffsetDateTime.parse(p.text)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringpersonv1PreferertKontaktadresse(
                valg = parsedValues.valg!!,
                aarsak = parsedValues.aarsak,
                adressegradering = parsedValues.adressegradering,
                ajourholdstidspunkt = parsedValues.ajourholdstidspunkt,
                erGjeldende = parsedValues.erGjeldende,
                gyldighetstidspunkt = parsedValues.gyldighetstidspunkt,
                kilde = parsedValues.kilde,
                kontaktadresseIFrittFormat = parsedValues.kontaktadresseIFrittFormat,
                opphoerstidspunkt = parsedValues.opphoerstidspunkt,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

