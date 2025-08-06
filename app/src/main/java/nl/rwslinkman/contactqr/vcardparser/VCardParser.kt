package nl.rwslinkman.contactqr.vcardparser

object VCardParser {

    const val FIELD_NAME = "N"
    const val FIELD_FULL_NAME = "FN"
    const val FIELD_EMAIL = "EMAIL"
    const val FIELD_EMAIL_HOME = "HOME"
    const val FIELD_EMAIL_WORK = "WORK"
    const val FIELD_PHONE_NUMBER = "TEL"
    const val FIELD_ORGANISATION = "ORG"
    const val FIELD_WEBSITE = "URL"

    fun parse(data: String): List<VCardField> {
        val dataItems =  data
            .lines()
            .filter { it.contains(":") && !it.startsWith("BEGIN") && !it.startsWith("END") }
            .map {
                val parts = it.split(":", limit = 2)
                parts[0] to parts[1]
            }.toMutableList()
        val version = dataItems.removeAt(0)
        val converter: VCardItemConverter = when(version.second) {
            "2.1" -> ItemConverter21()
            "3.0" -> ItemConverter30()
            else -> ItemConverterOther()
        }
        return dataItems.mapNotNull {
            converter.convertToField(it.first, it.second)
        }
    }
}