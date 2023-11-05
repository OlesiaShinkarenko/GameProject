package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import effective.office.gameproject.R

@Composable
fun VideoPreviewRow(
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
    previewResList: List<Int>
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = contentPadding,
        modifier = modifier,
    ) {
        items(previewResList) { item ->
            Video(
                item = item,
                modifier = Modifier.size(height = 120.dp, width = 240.dp)
            )
        }
    }
}

@Composable
fun Video(item: Int, modifier: Modifier) {
    Card(modifier = modifier.clip(RoundedCornerShape(6.dp))) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = item),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
    }

}

@Preview
@Composable
fun VideoPreviewRowPreview() {
    VideoPreviewRow(
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
        previewResList = listOf(
            R.drawable.video_preview1,
            R.drawable.video_preview2
        )
    )
}
