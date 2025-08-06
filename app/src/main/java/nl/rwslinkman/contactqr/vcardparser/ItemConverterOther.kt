package nl.rwslinkman.contactqr.vcardparser

class ItemConverterOther: VCardItemConverter {
    
    override fun convertToField(category: String, content: String): VCardField? = null
}