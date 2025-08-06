package nl.rwslinkman.contactqr.vcardparser

object VCardParser {

    fun parse(data: String): List<VCardField> {
        // TODO: Implement VCard parser
        return listOf(VCardField("FN", null, "Hello World"))
    }
}