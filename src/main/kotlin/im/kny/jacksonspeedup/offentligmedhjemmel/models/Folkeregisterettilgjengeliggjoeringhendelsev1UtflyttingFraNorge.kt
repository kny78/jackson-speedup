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
 * @param aarsak 
 * @param ajourholdstidspunkt 
 * @param gyldighetstidspunkt 
 * @param kilde 
 * @param opphoerstidspunkt 
 * @param tilflyttingsland 
 * @param tilflyttingsstedIUtlandet 
 * @param utflyttingsdato 
 */

data class Folkeregisterettilgjengeliggjoeringhendelsev1UtflyttingFraNorge (

    @field:JsonProperty("aarsak")
    val aarsak: kotlin.String? = null,

    @field:JsonProperty("ajourholdstidspunkt")
    val ajourholdstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("gyldighetstidspunkt")
    val gyldighetstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("kilde")
    val kilde: kotlin.String? = null,

    @field:JsonProperty("opphoerstidspunkt")
    val opphoerstidspunkt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("tilflyttingsland")
    val tilflyttingsland: kotlin.String? = null,

    @field:JsonProperty("tilflyttingsstedIUtlandet")
    val tilflyttingsstedIUtlandet: kotlin.String? = null,

    @field:JsonProperty("utflyttingsdato")
    val utflyttingsdato: java.time.LocalDate? = null

) {

    class ParsedValues{
        var aarsak: kotlin.String? = null
        var ajourholdstidspunkt: java.time.OffsetDateTime? = null
        var gyldighetstidspunkt: java.time.OffsetDateTime? = null
        var kilde: kotlin.String? = null
        var opphoerstidspunkt: java.time.OffsetDateTime? = null
        var tilflyttingsland: kotlin.String? = null
        var tilflyttingsstedIUtlandet: kotlin.String? = null
        var utflyttingsdato: java.time.LocalDate? = null
    }

    @Suppress("UNUSED_VALUE")
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1UtflyttingFraNorge>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1UtflyttingFraNorge {
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

                    "aarsak" -> parsedValues.aarsak = p.text
                    "ajourholdstidspunkt" -> parsedValues.ajourholdstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "gyldighetstidspunkt" -> parsedValues.gyldighetstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "kilde" -> parsedValues.kilde = p.text
                    "opphoerstidspunkt" -> parsedValues.opphoerstidspunkt = java.time.OffsetDateTime.parse(p.text)
                    "tilflyttingsland" -> parsedValues.tilflyttingsland = p.text
                    "tilflyttingsstedIUtlandet" -> parsedValues.tilflyttingsstedIUtlandet = p.text
                    "utflyttingsdato" -> parsedValues.utflyttingsdato = java.time.LocalDate.parse(p.text)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringhendelsev1UtflyttingFraNorge(
                aarsak = parsedValues.aarsak,
                ajourholdstidspunkt = parsedValues.ajourholdstidspunkt,
                gyldighetstidspunkt = parsedValues.gyldighetstidspunkt,
                kilde = parsedValues.kilde,
                opphoerstidspunkt = parsedValues.opphoerstidspunkt,
                tilflyttingsland = parsedValues.tilflyttingsland,
                tilflyttingsstedIUtlandet = parsedValues.tilflyttingsstedIUtlandet,
                utflyttingsdato = parsedValues.utflyttingsdato,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

