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
import androidx.compose.ui.unit.dp
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import androidx.core.graphics.createBitmap
import androidx.core.graphics.set


@Composable
fun QRCodePage(vcardData: String) {
    val qrBitmap = remember(vcardData) { generateQrCode(vcardData) }

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(32.dp)) {
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
        val size = 1024 // pixels
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