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
import java.time.*
import java.time.format.*
/**
 * 
 * @param personnavn 
 * @param statsborgerskap 
 * @param foedselsdato 
 * @param kjoenn 
 */
data class Folkeregisterettilgjengeliggjoeringhendelsev1IdentifiserendeInformasjon(
    @field:JsonProperty("personnavn")
    val personnavn: Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn,
    @field:JsonProperty("statsborgerskap")
    val statsborgerskap: kotlin.collections.List<kotlin.String>,
    @field:JsonProperty("foedselsdato")
    val foedselsdato: java.time.LocalDate? = null,
    @field:JsonProperty("kjoenn")
    val kjoenn: Folkeregisterettilgjengeliggjoeringhendelsev1IdentifiserendeInformasjon.Kjoenn? = null
) 
{
    /**
    * 
    * Values: kvinne,mann
    */
    enum class Kjoenn(val value: kotlin.String){
        kvinne("kvinne"),
        mann("mann");
    }
    class ParsedValues{
        var personnavn: Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn? = null
        var statsborgerskap: List<kotlin.String>? = null
        var foedselsdato: java.time.LocalDate? = null
        var kjoenn: Folkeregisterettilgjengeliggjoeringhendelsev1IdentifiserendeInformasjon.Kjoenn? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1IdentifiserendeInformasjon>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1IdentifiserendeInformasjon {
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
                    "personnavn" -> parsedValues.personnavn = Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn.deserializer.deserialize(p, ctx)
                    "statsborgerskap" -> {
                        val list : ArrayList<String> = ArrayList()
                        while(p.nextToken() != JsonToken.END_ARRAY) {
                            list.add(p.text)
                        }
                        parsedValues.statsborgerskap = list
                      }

                    "foedselsdato" -> parsedValues.foedselsdato = LocalDate.parse(p.text)

                    "kjoenn" -> parsedValues.kjoenn = Folkeregisterettilgjengeliggjoeringhendelsev1IdentifiserendeInformasjon.Kjoenn.valueOf(p.text)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringhendelsev1IdentifiserendeInformasjon(
                personnavn = parsedValues.personnavn!!,
                statsborgerskap = parsedValues.statsborgerskap!!,
                foedselsdato = parsedValues.foedselsdato,
                kjoenn = parsedValues.kjoenn,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}
