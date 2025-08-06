package nl.rwslinkman.contactqr.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nl.rwslinkman.contactqr.ui.theme.ContactQRTheme

@Composable
fun VCardPagerScreen(vcardData: String) {
    val pagerState = rememberPagerState { 2 }

    Box(Modifier.fillMaxSize().padding(WindowInsets.systemBars.asPaddingValues())) {
        HorizontalPager(
            state = pagerState,
            pageSpacing = 16.dp,
        ) { pageIdx ->
            when (pageIdx) {
                0 -> QRCodePage(vcardData)
                1 -> RawDataPage(vcardData)
            }
        }
        Row(
            Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(pagerState.pageCount) { iteration ->
                val color =
                    if (pagerState.currentPage == iteration) Color.DarkGray else Color.LightGray
                Box(
                    modifier = Modifier
                        .padding(2.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(16.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun VCardPagerScreenPreview() {
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
        VCardPagerScreen(sampleData)
    }
}