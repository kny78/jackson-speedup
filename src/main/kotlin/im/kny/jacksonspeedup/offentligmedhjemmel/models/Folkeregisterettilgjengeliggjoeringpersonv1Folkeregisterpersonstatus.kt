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
 * @param status 
 * @param aarsak 
 * @param ajourholdstidspunkt 
 * @param erGjeldende 
 * @param gyldighetstidspunkt 
 * @param kilde 
 * @param opphoerstidspunkt 
 */
data class Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterpersonstatus(
    @field:JsonProperty("status")
    val status: Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterpersonstatus.Status,
    @field:JsonProperty("aarsak")
    val aarsak: kotlin.String? = null,
    @field:JsonProperty("ajourholdstidspunkt")
    val ajourholdstidspunkt: java.time.OffsetDateTime? = null,
    @field:JsonProperty("erGjeldende")
    val erGjeldende: kotlin.Boolean? = null,
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
    * Values: bosatt,utflyttet,forsvunnet,doed,opphoert,foedselsregistrert,midlertidig,inaktiv,ikkeBosatt,aktiv
    */
    enum class Status(val value: kotlin.String){
        bosatt("bosatt"),
        utflyttet("utflyttet"),
        forsvunnet("forsvunnet"),
        doed("doed"),
        opphoert("opphoert"),
        foedselsregistrert("foedselsregistrert"),
        midlertidig("midlertidig"),
        inaktiv("inaktiv"),
        ikkeBosatt("ikkeBosatt"),
        aktiv("aktiv");
    }
    class ParsedValues{
        var status: Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterpersonstatus.Status? = null
        var aarsak: kotlin.String? = null
        var ajourholdstidspunkt: java.time.OffsetDateTime? = null
        var erGjeldende: kotlin.Boolean? = null
        var gyldighetstidspunkt: java.time.OffsetDateTime? = null
        var kilde: kotlin.String? = null
        var opphoerstidspunkt: java.time.OffsetDateTime? = null
    }

    class Deserializer : JsonDeserializer<Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterpersonstatus>() {
        override fun deserialize(p: JsonParser, ctx: DeserializationContext): Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterpersonstatus {
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

                    "status" -> parsedValues.status = Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterpersonstatus.Status.valueOf(p.text)

                    "aarsak" -> parsedValues.aarsak = p.text
                    "ajourholdstidspunkt" -> parsedValues.ajourholdstidspunkt = OffsetDateTime.parse(p.text)
                    "erGjeldende" -> parsedValues.erGjeldende = p.text.toBoolean()
                    "gyldighetstidspunkt" -> parsedValues.gyldighetstidspunkt = OffsetDateTime.parse(p.text)
                    "kilde" -> parsedValues.kilde = p.text
                    "opphoerstidspunkt" -> parsedValues.opphoerstidspunkt = OffsetDateTime.parse(p.text)

                    else -> p.skipChildren()
                }
                curr = p.nextToken()
            }

            return Folkeregisterettilgjengeliggjoeringpersonv1Folkeregisterpersonstatus(
                status = parsedValues.status!!,
                aarsak = parsedValues.aarsak,
                ajourholdstidspunkt = parsedValues.ajourholdstidspunkt,
                erGjeldende = parsedValues.erGjeldende,
                gyldighetstidspunkt = parsedValues.gyldighetstidspunkt,
                kilde = parsedValues.kilde,
                opphoerstidspunkt = parsedValues.opphoerstidspunkt,)
        }
    }

    companion object {
        val deserializer by lazy(LazyThreadSafetyMode.NONE) { Deserializer() }
    }
}