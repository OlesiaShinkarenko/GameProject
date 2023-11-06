package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import effective.office.gameproject.R
import effective.office.gameproject.ui.theme.Padding
import effective.office.gameproject.ui.theme.Shape
import effective.office.gameproject.ui.theme.Size

@Composable
fun VideoPreviewRow(
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
    previewResList: List<Int>
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(Size.size_16),
        contentPadding = contentPadding,
        modifier = modifier,
    ) {
        items(previewResList) { item ->
            Video(
                item = item,
                modifier = Modifier.size(height = Size.size_120, width = Size.size_240)
            )
        }
    }
}

@Composable
fun Video(item: Int, modifier: Modifier) {
    Card(modifier = modifier.clip(Shape.ellipse_6)) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = item),
            contentDescription = stringResource(id = R.string.preview_video),
            contentScale = ContentScale.FillWidth
        )
    }

}

@Preview
@Composable
fun VideoPreviewRowPreview() {
    VideoPreviewRow(
        contentPadding = Padding.horizontal_24,
        previewResList = listOf(
            R.drawable.video_preview1,
            R.drawable.video_preview2
        )
    )
}
