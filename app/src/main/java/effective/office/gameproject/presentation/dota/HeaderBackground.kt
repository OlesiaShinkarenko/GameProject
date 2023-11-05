package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(modifier = modifier) {
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
                    translationY = 160f
                }
                .padding(horizontal = 21.dp)
                .padding(bottom = 40.dp),
        ) {
            content()
        }
    }
}