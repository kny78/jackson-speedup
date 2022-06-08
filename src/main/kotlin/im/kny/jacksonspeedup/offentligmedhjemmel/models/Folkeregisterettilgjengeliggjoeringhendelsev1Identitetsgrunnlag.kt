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
import java.time.*
import java.time.format.*
/**
 * 
 * @param legitimasjonskontroll 
 * @param aarsak 
 * @param ajourholdstidspunkt 
 * @param gyldighetstidspunkt 
 * @param kilde 
 * @param opphoerstidspunkt 
 */
data class Folkeregisterettilgjengeliggjoeringhendelsev1Identitetsgrunnlag(
    @field:JsonProperty("legitimasjonskontroll")
    val legitimasjonskontroll: Folkeregisterettilgjengeliggjoeringhendelsev1Identitetsgrunnlag.Legitimasjonskontroll,
    @field:JsonProperty("aarsak")
    val aarsak: kotlin.String? = null,
    @field:JsonProperty("ajourholdstidspunkt")
    val ajourholdstidspunkt: java.time.OffsetDateTime? = null,
    @field:JsonProperty("gyldighetstidspunkt")
    val gyldighetstidspunkt: java.time.OffsetDateTime? = null,
    @field:JsonProperty("kilde")
    val kilde: kotlin.String? = null,
    @field:JsonProperty("opphoerstidspunkt")
    val opphoerstidspunkt: java.time.OffsetDateTime? = null
) 
{
    /**
    * 
    * Values: ingenStatus,ikkeKontrollert,kontrollert
    */
    enum class Legitimasjonskontroll(val value: kotlin.String){
        ingenStatus("ingenStatus"),
        ikkeKontrollert("ikkeKontrollert"),
        kontrollert("kontrollert");
    }
    class ParsedValues{
        var legitimasjonskontroll: Folkeregisterettilgjengeliggjoeringhendelsev1Identitetsgrunnlag.Legitimasjonskontroll? = null
        var aarsak: kotlin.String? = null
        var ajourholdstidspunkt: java.time.OffsetDateTime? = null
        var gyldighetstidspunkt: java.time.OffsetDateTime? = null
        var kilde: kotlin.String? = null
        var opphoerstidspunkt: java.time.OffsetDateTime? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringhendelsev1Identitetsgrunnlag>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringhendelsev1Identitetsgrunnlag {
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

                    "legitimasjonskontroll" -> parsedValues.legitimasjonskontroll = Folkeregisterettilgjengeliggjoeringhendelsev1Identitetsgrunnlag.Legitimasjonskontroll.valueOf(p.text)

                    "aarsak" -> parsedValues.aarsak = p.text
                    "ajourholdstidspunkt" -> parsedValues.ajourholdstidspunkt = OffsetDateTime.parse(p.text)
                    "gyldighetstidspunkt" -> parsedValues.gyldighetstidspunkt = OffsetDateTime.parse(p.text)
                    "kilde" -> parsedValues.kilde = p.text
                    "opphoerstidspunkt" -> parsedValues.opphoerstidspunkt = OffsetDateTime.parse(p.text)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringhendelsev1Identitetsgrunnlag(
                legitimasjonskontroll = parsedValues.legitimasjonskontroll!!,
                aarsak = parsedValues.aarsak,
                ajourholdstidspunkt = parsedValues.ajourholdstidspunkt,
                gyldighetstidspunkt = parsedValues.gyldighetstidspunkt,
                kilde = parsedValues.kilde,
                opphoerstidspunkt = parsedValues.opphoerstidspunkt,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}