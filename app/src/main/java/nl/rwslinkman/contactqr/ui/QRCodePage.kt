package nl.rwslinkman.contactqr.ui

import android.graphics.Bitmap
import android.util.Log
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
import androidx.core.graphics.set
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import nl.rwslinkman.contactqr.ui.theme.ContactQRTheme


@Composable
fun QRCodePage(vcardData: String) {
    val qrBitmap = remember(vcardData) { generateQrCode(vcardData) }

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

fun generateQrCode(data: String): Bitmap? {
    return try {
        Log.i("QRCodePage", "generateQrCode")
        val size = 2048 // pixels
        val bits = QRCodeWriter().encode(data, BarcodeFormat.QR_CODE, size, size)
        val bmp = createBitmap(size, size, Bitmap.Config.RGB_565)
        for (x in 0 until size) {
            for (y in 0 until size) {
                bmp[x, y] =
                    if (bits[x, y]) android.graphics.Color.BLACK else android.graphics.Color.WHITE
            }
        }
        bmp
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}

@Preview(showBackground = true)
@Composable
fun QRCodePagePreview() {
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
        QRCodePage(sampleData)
    }
}