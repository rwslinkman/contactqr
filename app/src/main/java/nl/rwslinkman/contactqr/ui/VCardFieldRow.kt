package nl.rwslinkman.contactqr.ui

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import nl.rwslinkman.contactqr.R
import nl.rwslinkman.contactqr.vcardparser.VCardField

@Composable
fun VCardFieldRow(field: VCardField) {
    val (label, icon) = getLabelAndIconForType(field, context = LocalContext.current)

    Row(
        modifier = Modifier.fillMaxWidth().padding(bottom = 6.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            modifier = Modifier.size(24.dp)
        )
        Column {
            Text(text = label, style = MaterialTheme.typography.labelSmall)
            Text(text = field.content, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

fun getLabelAndIconForType(field: VCardField, context: Context): Pair<String, ImageVector> {
    // TODO: Use string identifiers
    return when (field.category.uppercase()) {
        "FN" -> context.resources.getString(R.string.vcard_field_fullname) to Icons.Default.Person
        "N" -> context.resources.getString(R.string.vcard_field_name) to Icons.Default.Person
        "EMAIL" -> context.resources.getString(R.string.vcard_field_email) to Icons.Default.Email
        "TEL" -> context.resources.getString(R.string.vcard_field_phone) to Icons.Default.Phone
        "ORG" -> context.resources.getString(R.string.vcard_field_organisation) to Icons.Default.Place
        else -> field.category to Icons.Default.Info
    }
}