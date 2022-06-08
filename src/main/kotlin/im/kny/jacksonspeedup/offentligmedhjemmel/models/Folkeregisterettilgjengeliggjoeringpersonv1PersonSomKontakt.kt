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

import im.kny.jacksonspeedup.offentligmedhjemmel.models.Folkeregisterettilgjengeliggjoeringpersonv1Personnavn


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
 * @param foedselsEllerDNummer 
 * @param foedselsdato 
 * @param personnavn 
 */
data class Folkeregisterettilgjengeliggjoeringpersonv1PersonSomKontakt(
    @field:JsonProperty("foedselsEllerDNummer")
    val foedselsEllerDNummer: kotlin.String? = null,
    @field:JsonProperty("foedselsdato")
    val foedselsdato: java.time.LocalDate? = null,
    @field:JsonProperty("personnavn")
    val personnavn: Folkeregisterettilgjengeliggjoeringpersonv1Personnavn? = null
) 
{
    class ParsedValues{
        var foedselsEllerDNummer: kotlin.String? = null
        var foedselsdato: java.time.LocalDate? = null
        var personnavn: Folkeregisterettilgjengeliggjoeringpersonv1Personnavn? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringpersonv1PersonSomKontakt>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringpersonv1PersonSomKontakt {
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

                    "foedselsEllerDNummer" -> parsedValues.foedselsEllerDNummer = p.text
                    "foedselsdato" -> parsedValues.foedselsdato = LocalDate.parse(p.text)
                    "personnavn" -> parsedValues.personnavn = Folkeregisterettilgjengeliggjoeringpersonv1Personnavn.deserializer.deserialize(p, ctx)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringpersonv1PersonSomKontakt(
                foedselsEllerDNummer = parsedValues.foedselsEllerDNummer,
                foedselsdato = parsedValues.foedselsdato,
                personnavn = parsedValues.personnavn,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}
