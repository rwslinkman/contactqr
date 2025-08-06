package nl.rwslinkman.contactqr

import android.graphics.Bitmap
import android.util.Log
import androidx.core.graphics.createBitmap
import androidx.core.graphics.set
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import nl.rwslinkman.contactqr.vcardparser.VCardField
import nl.rwslinkman.contactqr.vcardparser.VCardParser

class VCardViewModel : ViewModel() {

    private val _vcardData = MutableStateFlow<String?>(null)
    val vcardData: StateFlow<String?> = _vcardData

    private val _qrCodeBitmap = MutableStateFlow<Bitmap?>(null)
    val qrCodeBitmap: StateFlow<Bitmap?> = _qrCodeBitmap

    private val _parsedVCardFields = MutableStateFlow<List<VCardField>?>(null)
    val parsedVCardFields: StateFlow<List<VCardField>?> = _parsedVCardFields

    fun setup(intentData: String) {
        _vcardData.value = intentData
        generateQrCode(intentData)
        parseVCard(intentData)
    }

    private fun generateQrCode(data: String) = viewModelScope.launch {
        val qrImage = try {
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
        _qrCodeBitmap.value = qrImage
    }

    private fun parseVCard(data: String) {
        val parseResult = VCardParser.parse(data)
        _parsedVCardFields.value = parseResult
    }
}