package effective.office.gameproject.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import effective.office.gameproject.ui.theme.AppTheme.BgColors.divider
import effective.office.gameproject.ui.theme.AppTheme.BgColors.primary
import effective.office.gameproject.ui.theme.AppTheme.ButtonColors.border
import effective.office.gameproject.ui.theme.AppTheme.ButtonColors.button
import effective.office.gameproject.ui.theme.AppTheme.ButtonColors.categoryB
import effective.office.gameproject.ui.theme.AppTheme.TextColors.buttonT
import effective.office.gameproject.ui.theme.AppTheme.TextColors.category
import effective.office.gameproject.ui.theme.AppTheme.TextColors.count
import effective.office.gameproject.ui.theme.AppTheme.TextColors.description
import effective.office.gameproject.ui.theme.AppTheme.TextColors.header1
import effective.office.gameproject.ui.theme.AppTheme.TextColors.header2
import effective.office.gameproject.ui.theme.AppTheme.TextColors.header3
import effective.office.gameproject.ui.theme.AppTheme.TextColors.report


@Immutable
data class CustomColors(
    val primary: Color,
    val divider: Color,
    val count: Color,
    val description: Color,
    val header1: Color,
    val header2: Color,
    val category: Color,
    val header3: Color,
    val report: Color,
    val buttonT: Color,
    val button: Color,
    val border: Color,
    val categoryB: Color,
)

val LocalCustomColors = staticCompositionLocalOf {
    CustomColors(
        primary = primary,
        divider = divider,
        count = count,
        description = description,
        header1 = header1,
        header2 = header2,
        category = category,
        header3 = header3,
        report = report,
        buttonT = buttonT,
        button = button,
        border = border,
        categoryB = categoryB,
    )
}

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    val colors = CustomColors(
        primary = primary,
        divider = divider,
        count = count,
        description = description,
        header1 = header1,
        header2 = header2,
        category = category,
        header3 = header3,
        report = report,
        buttonT = buttonT,
        button = button,
        border = border,
        categoryB = categoryB,
    )
    CompositionLocalProvider(
        LocalCustomColors provides colors,
        content = content
    )

}