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
 * @param organisasjonsnavn 
 * @param kontaktpersonnavn 
 * @param organisasjonsnummer 
 */

data class Folkeregisterettilgjengeliggjoeringhendelsev1OrganisasjonSomKontakt (

    @field:JsonProperty("organisasjonsnavn")
    val organisasjonsnavn: kotlin.String,

    @field:JsonProperty("kontaktpersonnavn")
    val kontaktpersonnavn: Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn? = null,

    @field:JsonProperty("organisasjonsnummer")
    val organisasjonsnummer: kotlin.String? = null

) {

    class ParsedValues{
        var organisasjonsnavn: kotlin.String? = null
        var kontaktpersonnavn: Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn? = null
        var organisasjonsnummer: kotlin.String? = null
    }
    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1OrganisasjonSomKontakt>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1OrganisasjonSomKontakt {
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
                    "organisasjonsnavn" -> parsedValues.organisasjonsnavn = p.text

                    "kontaktpersonnavn" -> parsedValues.kontaktpersonnavn = Folkeregisterettilgjengeliggjoeringhendelsev1Personnavn.deserializer.deserialize(p, ctx)
                    "organisasjonsnummer" -> parsedValues.organisasjonsnummer = p.text

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }
            return Folkeregisterettilgjengeliggjoeringhendelsev1OrganisasjonSomKontakt(
                organisasjonsnavn = parsedValues.organisasjonsnavn!!,
                kontaktpersonnavn = parsedValues.kontaktpersonnavn,
                organisasjonsnummer = parsedValues.organisasjonsnummer,)
        }
    }
    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }

}

