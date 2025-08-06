package nl.rwslinkman.contactqr.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import nl.rwslinkman.contactqr.vcardparser.VCardField

@Composable
fun VCardFieldRow(field: VCardField) {
    val (label, icon) = getLabelAndIconForType(field)

    Row(
        modifier = Modifier.fillMaxWidth(),
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

fun getLabelAndIconForType(field: VCardField): Pair<String, ImageVector> {
    // TODO: Use string identifiers
    return when (field.category.uppercase()) {
        "FN" -> "Full Name" to Icons.Default.Person
        "N" -> "Name" to Icons.Default.Person
        "EMAIL" -> "Email" to Icons.Default.Email
        "TEL" -> "Phone" to Icons.Default.Phone
        "ORG" -> "Organization" to Icons.Default.Home
        else -> field.category to Icons.Default.AccountBox
    }
}