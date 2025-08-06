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
import nl.rwslinkman.contactqr.SampleVCardData
import nl.rwslinkman.contactqr.ui.theme.ContactQRTheme
import nl.rwslinkman.contactqr.vcardparser.VCardField

@Composable
fun RawDataPage(
    rawVCardData: String?,
    parsedVCardData: List<VCardField>?)
{


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
            text = rawVCardData ?: "ERR: No data available",
            fontFamily = FontFamily.Monospace,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.wrapContentHeight().fillMaxWidth(),
        )
        parsedVCardData?.let {
            Text(
                stringResource(R.string.rawdata_title_processed),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.wrapContentHeight().fillMaxWidth().padding(vertical = 6.dp),
            )
            parsedVCardData.forEach { field ->
                VCardFieldRow(field)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RawDataPagePreview() {
    ContactQRTheme {
        RawDataPage(SampleVCardData.sample0, listOf())
    }
}