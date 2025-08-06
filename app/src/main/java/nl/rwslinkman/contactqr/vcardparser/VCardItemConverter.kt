package nl.rwslinkman.contactqr.vcardparser

interface VCardItemConverter {

    fun convertToField(category: String, content: String): VCardField?
}