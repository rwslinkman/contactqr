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
    fun testSample1() {
        val result = VCardParser.parse(SampleVCardData.sample1)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample2() {
        val result = VCardParser.parse(SampleVCardData.sample2)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample3() {
        val result = VCardParser.parse(SampleVCardData.sample3)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample4() {
        val result = VCardParser.parse(SampleVCardData.sample4)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample5() {
        val result = VCardParser.parse(SampleVCardData.sample5)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample6() {
        val result = VCardParser.parse(SampleVCardData.sample6)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample7() {
        val result = VCardParser.parse(SampleVCardData.sample7)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample8() {
        val result = VCardParser.parse(SampleVCardData.sample8)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample9() {
        val result = VCardParser.parse(SampleVCardData.sample9)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample10() {
        val result = VCardParser.parse(SampleVCardData.sample10)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
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
    fun testSample12() {
        val result = VCardParser.parse(SampleVCardData.sample12)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample13() {
        val result = VCardParser.parse(SampleVCardData.sample13)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample14() {
        val result = VCardParser.parse(SampleVCardData.sample14)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample15() {
        val result = VCardParser.parse(SampleVCardData.sample15)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample16_Gengar() {
        val result = VCardParser.parse(SampleVCardData.sample16)

        assertNotNull(result)
        assertEquals(8, result.size)
        assertNotNull(result.find { it.category == FIELD_NAME && it.content == "Gengar" })
        assertNotNull(result.find { it.category == FIELD_FULL_NAME && it.content == "Gengar" })
        assertNotNull(result.find { it.category == FIELD_PHONE_NUMBER && it.subcategory == FIELD_PHONE_NUMBER_HOME && it.content == "555-6666" })
        assertNotNull(result.find { it.category == FIELD_PHONE_NUMBER && it.subcategory == FIELD_PHONE_NUMBER_MOBILE && it.content == "555-9999" })
        assertNotNull(result.find { it.category == FIELD_EMAIL && it.subcategory == FIELD_EMAIL_INTERNET && it.content == "gengar@hauntmail.com" })
        assertNotNull(result.find { it.category == FIELD_EMAIL && it.content == "ghosty@spooknet.pkm" })
        assertNotNull(result.find { it.category == FIELD_ORGANISATION && it.content == "Ghost Guild" })
        assertNotNull(result.find { it.category == "TITLE" && it.content == "Master of Shadows" }) // Custom field test
    }

    @Test
    fun testSample17_Snorlax() {
        val result = VCardParser.parse(SampleVCardData.sample17)

        assertNotNull(result)
        assertEquals(7, result.size)
        assertNotNull(result.find { it.category == FIELD_NAME && it.content == "Snorlax" })
        assertNotNull(result.find { it.category == FIELD_FULL_NAME && it.content == "Snorlax" })
        assertNotNull(result.find { it.category == FIELD_PHONE_NUMBER && it.content == "555-1212" })
        assertNotNull(result.find { it.category == FIELD_EMAIL && it.content == "snorlax@snoozemail.com" }) // PREF
        assertNotNull(result.find { it.category == FIELD_EMAIL && it.content == "zzz@bedtime.org" })
        assertNotNull(result.find { it.category == FIELD_ORGANISATION && it.content == "Sleep Enthusiasts Club" })
        assertNotNull(result.find { it.category == "TITLE" && it.content == "Professional Napper" })
    }

    @Test
    fun testSample18() {
        val result = VCardParser.parse(SampleVCardData.sample18)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample19() {
        val result = VCardParser.parse(SampleVCardData.sample19)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }

    @Test
    fun testSample20_Alakazam() {
        val result = VCardParser.parse(SampleVCardData.sample20)

        assertNotNull(result)
        assertEquals(9, result.size)
        assertNotNull(result.find { it.category == FIELD_NAME && it.content == "Alakazam" })
        assertNotNull(result.find { it.category == FIELD_FULL_NAME && it.content == "Alakazam" })
        assertNotNull(result.find { it.category == FIELD_PHONE_NUMBER && it.content == "555-4444" })
        assertNotNull(result.find { it.category == FIELD_PHONE_NUMBER && it.content == "555-9876" })
        assertNotNull(result.find { it.category == FIELD_EMAIL && it.subcategory == FIELD_EMAIL_INTERNET && it.content == "alakazam@psychicmail.com" })
        assertNotNull(result.find { it.category == FIELD_EMAIL && it.content == "mind@telepathy.pkm" })
        assertNotNull(result.find { it.category == FIELD_ORGANISATION && it.content == "PokePsychics Co." })
        assertNotNull(result.find { it.category == "TITLE" && it.content == "Chief Telepath" })
        assertNotNull(result.find { it.category == "NOTE" && it.content == "Carries two spoons at all times" })
    }

    @Test
    fun testSample21() {
        val result = VCardParser.parse(SampleVCardData.sample21)

        assertNotNull(result)
        assertEquals(6, result.size)
        // TODO: Add specific assertions
    }
}