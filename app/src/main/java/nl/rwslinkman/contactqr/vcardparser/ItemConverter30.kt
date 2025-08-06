package nl.rwslinkman.contactqr.vcardparser

class ItemConverter30: VCardItemConverter {
    
    override fun convertToField(category: String, content: String): VCardField
    {
        // subcategory contained in content (TYPE=xyz)
        return VCardField(category, null, content)
    }
}