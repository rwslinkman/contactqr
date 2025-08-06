package nl.rwslinkman.contactqr.ui

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.createBitmap
import nl.rwslinkman.contactqr.ui.theme.ContactQRTheme

@Composable
fun QRCodePage(vcardData: Bitmap?) {
    val qrBitmap = remember { vcardData }

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)
    ) {
        qrBitmap?.let {
            Image(
                bitmap = it.asImageBitmap(),
                contentDescription = "QR Code",
                modifier = Modifier.fillMaxSize()
            )
        } ?: Text("Failed to generate QR code")
    }
}

@Preview(showBackground = true)
@Composable
fun QRCodePagePreview() {
    val fakeBitmap = remember {
        createBitmap(200, 200).apply {
            eraseColor(android.graphics.Color.GRAY)
        }
    }

    ContactQRTheme {
        QRCodePage(fakeBitmap)
    }
}