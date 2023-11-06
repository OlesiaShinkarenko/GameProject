package effective.office.gameproject.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

object AppTheme {
    val colors: CustomColors
        @Composable
        get() = LocalCustomColors.current

    val typography: CustomTypography
        @Composable
        get() = LocalCustomTypography.current

    object BackgroundColors {
        val primary = Color(0xFF050B18)
        val divider = Color(0xFF1A1F29)

        val primary_light = Color(0xFFFFFFFF)
    }

    object TextColors {
        val count = Color(0xFF45454D)
        val description = Color(0xB2EEF2FB)
        val header1 = Color(0xFFEEF2FB)
        val header2 = Color(0xFFFFFFFF)
        val category = Color(0xFF41A0E7)
        val header3 = Color(0x66FFFFFF)
        val report = Color(0xFFA8ADB7)
        val buttonT = Color(0xFF050B18)

        val count_light = Color(0xFF000000)
        val description_light = Color(0xFF1A1F29)
        val header1_light = Color(0xFF050B18)
        val header2_light = Color(0xFF0B162E)
        val header3_light = Color(0x66000000)
        val report_light = Color(0xFF1D1E22)
    }

    object ButtonColors {
        val button = Color(0xFFF4D144)
        val border = Color(0xFF1F2430)
        val categoryB = Color(0x3D44A9F4)
    }

    object TextStyle {
        val Medium = TextStyle(
            fontFamily = FontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            platformStyle = PlatformTextStyle(includeFontPadding = false),
            lineHeightStyle = LineHeightStyle(
                LineHeightStyle.Alignment.Proportional,
                LineHeightStyle.Trim.None
            )
        )
        val Bold_48 =
            TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None
                )
            )
        val Bold_20_26 =
            TextStyle(
                lineHeight = 26.sp,
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                ),
            )
        val Bold_20 =
            TextStyle(
                lineHeight = 26.sp,
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                ),
            )
        val Bold_16 =
            TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                ),
            )
        val Bold_12 =
            TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                ),
            )
        val Regular_16 =
            TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.W400,
                fontSize = 16.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                ),
            )
        val Regular_12 =
            TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.W400,
                fontSize = 12.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                ),
            )
        val Regular_12_19 =
            TextStyle(
                lineHeight = 19.sp,
                fontFamily = FontFamily,
                fontWeight = FontWeight.W400,
                fontSize = 12.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                ),
            )
        val Regular_12_20 =
            TextStyle(
                lineHeight = 20.sp,
                fontFamily = FontFamily,
                fontWeight = FontWeight.W400,
                fontSize = 12.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None,
                ),
            )
    }
}