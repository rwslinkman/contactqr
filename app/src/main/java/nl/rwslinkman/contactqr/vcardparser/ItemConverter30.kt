package nl.rwslinkman.contactqr.vcardparser

class ItemConverter30: VCardItemConverter {
    
    override fun convertToField(category: String, content: String): VCardField
    {
        // subcategory contained in category (TYPE=xyz)
        val catParts = category.split(";")
        val subcategory = if(catParts.size > 1) catParts[1].replace("TYPE=", "") else null
        return VCardField(catParts[0], subcategory, content)
    }
}