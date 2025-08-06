package nl.rwslinkman.contactqr.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VCardPagerScreen(vcardData: String) {
    val pages =  listOf(
        QRCodePage(vcardData),
        RawDataPage(vcardData)
    )
    val pagerState = rememberPagerState { pages.size }

    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(0.dp),
        pageSpacing = 16.dp,
        verticalAlignment = Alignment.CenterVertically,
    ) { pageIdx -> pages[pageIdx] }
}