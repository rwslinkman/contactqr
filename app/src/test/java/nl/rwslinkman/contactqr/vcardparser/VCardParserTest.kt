package nl.rwslinkman.contactqr.vcardparser

import junit.framework.TestCase.assertNotNull
import nl.rwslinkman.contactqr.SampleVCardData
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_EMAIL
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_EMAIL_HOME
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_EMAIL_INTERNET
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_EMAIL_WORK
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_NAME
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_FULL_NAME
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_ORGANISATION
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_PHONE_NUMBER
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_PHONE_NUMBER_HOME
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_PHONE_NUMBER_MOBILE
import nl.rwslinkman.contactqr.vcardparser.VCardParser.FIELD_WEBSITE
import org.junit.Test
import kotlin.test.assertEquals

class VCardParserTest {

    @Test
    fun testDefaultSample() {
        val result = VCardParser.parse(SampleVCardData.sample0)

        assertNotNull(result)
        assertEquals(6, result.size)
        assertNotNull(result.find { it.category == FIELD_NAME && it.content == "LastName;FirstName;;;" })
        assertNotNull(result.find { it.category == FIELD_FULL_NAME && it.content == "FirstName LastName" })
        assertNotNull(result.find { it.category == FIELD_PHONE_NUMBER && it.content == "+31600000000" })
        assertNotNull(result.find { it.category == FIELD_EMAIL && it.subcategory == FIELD_EMAIL_HOME && it.content == "personal@mail.com" })
        assertNotNull(result.find { it.category == FIELD_EMAIL && it.subcategory == FIELD_EMAIL_WORK && it.content == "work@mail.com" })
        assertNotNull(result.find { it.category == FIELD_WEBSITE && it.content == "https://mysite.com" })
    }

    @Test
    fun testSample11() {
        val result = VCardParser.parse(SampleVCardData.sample11)

        assertNotNull(result)
        assertEquals(7, result.size)
        assertNotNull(result.find { it.category == FIELD_NAME && it.content == "Pikachu;;;;" })
        assertNotNull(result.find { it.category == FIELD_FULL_NAME && it.content == "Pikachu" })
        assertNotNull(result.find { it.category == FIELD_PHONE_NUMBER && it.subcategory == FIELD_PHONE_NUMBER_HOME && it.content == "555-1122" })
        assertNotNull(result.find { it.category == FIELD_PHONE_NUMBER && it.subcategory == FIELD_PHONE_NUMBER_MOBILE && it.content == "555-3344" })
        assertNotNull(result.find { it.category == FIELD_EMAIL && it.subcategory == FIELD_EMAIL_INTERNET && it.content == "thunderbolt@poke-mail.com" })
        assertNotNull(result.find { it.category == FIELD_EMAIL && it.subcategory == FIELD_EMAIL_WORK && it.content == "pika.work@pokecompany.com" })
        assertNotNull(result.find { it.category == FIELD_ORGANISATION && it.content == "Electric Rodents Inc." })
    }

    @Test
    fun testAll() {
        SampleVCardData.allSamples.forEach {
            VCardParser.parse(it)
        }
    }
}