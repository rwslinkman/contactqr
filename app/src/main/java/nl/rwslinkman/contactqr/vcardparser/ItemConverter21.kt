package nl.rwslinkman.contactqr.vcardparser

class ItemConverter21: VCardItemConverter {

    override fun convertToField(category: String, content: String): VCardField
    {
        // subcategory contained in category, separated by ';'
        val catParts = category.split(";")
        val subcategory = if(catParts.size > 1) catParts[1] else null
        return VCardField(catParts[0], subcategory, content)
    }
}