package effective.office.gameproject.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf


@Composable
fun AppTheme(
    content:@Composable ()->Unit
) {
    CompositionLocalProvider(
        content = content
    )
}