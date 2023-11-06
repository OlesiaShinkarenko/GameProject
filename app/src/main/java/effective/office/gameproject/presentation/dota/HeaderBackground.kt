package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import effective.office.gameproject.ui.theme.Padding
import effective.office.gameproject.ui.theme.Size

@Composable
fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val padding = PaddingValues(bottom = (Size.size_54 * 1f) + Size.size_16)
    Box(modifier = modifier.padding(padding)) {
        Image(
            modifier = modifier,
            contentScale = ContentScale.FillWidth,
            painter = painter,
            contentDescription = null
        )
        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .graphicsLayer {
                    translationY = (Size.size_54 * 1f).toPx()
                }
                .padding(Padding.horizontal_24)
        ) {
            content()
        }
    }
}