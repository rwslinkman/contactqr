package nl.rwslinkman.contactqr

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import nl.rwslinkman.contactqr.ui.MainScreen
import nl.rwslinkman.contactqr.ui.VCardPagerScreen
import nl.rwslinkman.contactqr.ui.theme.ContactQRTheme
import java.io.FileNotFoundException
import java.io.IOException
import java.io.InputStream

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactQRTheme {
                when {
                    intent?.action == Intent.ACTION_SEND -> {
                        val intentData = readVCardDataFromIntent(intent)
                        if (intentData == null) {
                            // TODO: Create error screen
                            MainScreen()
                        } else {
                            VCardPagerScreen(vcardData = intentData)
                        }
                    }
                    else -> {
                        // Normal app startup
                        MainScreen()
                    }
                }
            }
        }
    }

    /**
     * Inspired by https://stackoverflow.com/a/12771561/878523
     */
    private fun readVCardDataFromIntent(intent: Intent): String? {
        val uri = intent.getParcelableExtra(Intent.EXTRA_STREAM) as Uri?

        val cr = contentResolver
        var stream: InputStream? = null
        try {
            stream = cr.openInputStream(uri!!)
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
            return null
        }

        val fileContent = StringBuffer("")
        var ch: Int
        try {
            while ((stream!!.read().also { ch = it }) != -1) fileContent.append(ch.toChar())
        } catch (e: IOException) {
            e.printStackTrace()
            return null
        }
        finally {
            stream?.close()
        }
        return String(fileContent)
    }
}