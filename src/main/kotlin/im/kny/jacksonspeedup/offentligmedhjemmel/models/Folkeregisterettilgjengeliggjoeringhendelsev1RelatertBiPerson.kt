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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.type.*


/**
 * 
 *
 * @param navn 
 * @param foedselsdato 
 * @param kjoenn 
 * @param statsborgerskap 
 */

data class Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson (

    @field:JsonProperty("navn")
    val navn: Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn,

    @field:JsonProperty("foedselsdato")
    val foedselsdato: java.time.LocalDate? = null,

    @field:JsonProperty("kjoenn")
    val kjoenn: Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson.Kjoenn? = null,

    @field:JsonProperty("statsborgerskap")
    val statsborgerskap: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: kvinne,mann
     */
    enum class Kjoenn(val value: kotlin.String) {
        @JsonProperty(value = "kvinne") kvinne("kvinne"),
        @JsonProperty(value = "mann") mann("mann");
    }
    class ParsedValues{
        var navn: Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn? = null
        var foedselsdato: java.time.LocalDate? = null
        var kjoenn: Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson.Kjoenn? = null
        var statsborgerskap: kotlin.String? = null
    }
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson {
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
                    "navn" -> parsedValues.navn = Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn.deserializer.deserialize(p, ctx)

                    "foedselsdato" -> parsedValues.foedselsdato = java.time.LocalDate.parse(p.text)

                    "kjoenn" -> parsedValues.kjoenn = Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson.Kjoenn.valueOf(p.text)
                    "statsborgerskap" -> parsedValues.statsborgerskap = p.text

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringhendelsev1RelatertBiPerson(
                navn = parsedValues.navn!!,
                foedselsdato = parsedValues.foedselsdato,
                kjoenn = parsedValues.kjoenn,
                statsborgerskap = parsedValues.statsborgerskap,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

