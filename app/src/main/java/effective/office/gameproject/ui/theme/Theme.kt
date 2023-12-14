package effective.office.gameproject.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import effective.office.gameproject.ui.theme.AppTheme.BackgroundColors.divider
import effective.office.gameproject.ui.theme.AppTheme.BackgroundColors.primary
import effective.office.gameproject.ui.theme.AppTheme.BackgroundColors.primary_light
import effective.office.gameproject.ui.theme.AppTheme.ButtonColors.border
import effective.office.gameproject.ui.theme.AppTheme.ButtonColors.button
import effective.office.gameproject.ui.theme.AppTheme.ButtonColors.categoryB
import effective.office.gameproject.ui.theme.AppTheme.TextColors.buttonT
import effective.office.gameproject.ui.theme.AppTheme.TextColors.category
import effective.office.gameproject.ui.theme.AppTheme.TextColors.count
import effective.office.gameproject.ui.theme.AppTheme.TextColors.count_light
import effective.office.gameproject.ui.theme.AppTheme.TextColors.description
import effective.office.gameproject.ui.theme.AppTheme.TextColors.description_light
import effective.office.gameproject.ui.theme.AppTheme.TextColors.header1
import effective.office.gameproject.ui.theme.AppTheme.TextColors.header1_light
import effective.office.gameproject.ui.theme.AppTheme.TextColors.header2
import effective.office.gameproject.ui.theme.AppTheme.TextColors.header2_light
import effective.office.gameproject.ui.theme.AppTheme.TextColors.header3
import effective.office.gameproject.ui.theme.AppTheme.TextColors.header3_light
import effective.office.gameproject.ui.theme.AppTheme.TextColors.report
import effective.office.gameproject.ui.theme.AppTheme.TextColors.report_light


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


val LocalCustomTypography = staticCompositionLocalOf {
    CustomTypography(
        Medium = AppTheme.TextStyle.Medium,
        Bold_48 = AppTheme.TextStyle.Bold_48,
        Bold_20_26 = AppTheme.TextStyle.Bold_20_26,
        Bold_20 = AppTheme.TextStyle.Bold_20,
        Bold_16 = AppTheme.TextStyle.Bold_16,
        Bold_12 = AppTheme.TextStyle.Bold_12,
        Regular_16 = AppTheme.TextStyle.Regular_16,
        Regular_12 = AppTheme.TextStyle.Regular_12,
        Regular_12_19 = AppTheme.TextStyle.Regular_12_19,
        Regular_12_20 = AppTheme.TextStyle.Regular_12_20,
    )
}

val lightColors = CustomColors(
    primary = primary_light,
    divider = divider,
    count = count_light,
    description = description_light,
    header1 = header1_light,
    header2 = header2_light,
    category = category,
    header3 = header3_light,
    report = report_light,
    buttonT = buttonT,
    button = button,
    border = border,
    categoryB = categoryB,
)
val darkColors = CustomColors(
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

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = when {
        darkTheme -> darkColors
        else -> lightColors
    }
    val typography = CustomTypography(
        Medium = AppTheme.TextStyle.Medium,
        Bold_48 = AppTheme.TextStyle.Bold_48,
        Bold_20_26 = AppTheme.TextStyle.Bold_20_26,
        Bold_20 = AppTheme.TextStyle.Bold_20,
        Bold_16 = AppTheme.TextStyle.Bold_16,
        Bold_12 = AppTheme.TextStyle.Bold_12,
        Regular_16 = AppTheme.TextStyle.Regular_16,
        Regular_12 = AppTheme.TextStyle.Regular_12,
        Regular_12_19 = AppTheme.TextStyle.Regular_12_19,
        Regular_12_20 = AppTheme.TextStyle.Regular_12_20,
    )

    CompositionLocalProvider(
        LocalCustomColors provides colors,
        LocalCustomTypography provides typography,
        content = content
    )

}