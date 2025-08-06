package nl.rwslinkman.contactqr.vcardparser

class ItemConverter21: VCardItemConverter {

    override fun convertToField(category: String, content: String): VCardField
    {
        // subcategory contained in category, separated by ';'
        return VCardField(category, null, content)
    }
}