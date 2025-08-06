package nl.rwslinkman.contactqr.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nl.rwslinkman.contactqr.R
import nl.rwslinkman.contactqr.ui.theme.ContactQRTheme

@Composable
fun RawDataPage(vcardData: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            stringResource(R.string.rawdata_title_raw),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.wrapContentHeight().fillMaxWidth()
        )
        Text(
            text = vcardData,
            fontFamily = FontFamily.Monospace,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.wrapContentHeight().fillMaxWidth(),
        )
        Text(
            stringResource(R.string.rawdata_title_processed),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.wrapContentHeight().fillMaxWidth().padding(top = 12.dp),
        )
        Text(
            "TODO",
            modifier = Modifier.wrapContentHeight().fillMaxWidth(),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RawDataPagePreview() {
    ContactQRTheme {
        val sampleData =
            "BEGIN:VCARD\n" +
            "VERSION:2.1\n" +
            "N:LastName;FirstName;;;\n" +
            "FN:FirstName LastName\n" +
            "TEL;CELL:+31600000000\n" +
            "EMAIL;HOME:personal@mail.com\n" +
            "EMAIL;WORK:work@mail.com\n" +
            "URL:https://mysite.com\n" +
            "END:VCARD"
        RawDataPage(sampleData)
    }
}