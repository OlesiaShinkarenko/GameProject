package effective.office.gameproject.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

object AppTheme {
    object BgColors{
        val primary @Composable get() = Color(0xFF050B18)
    }
    object TextColors{
    val count
        @Composable
        get() = Color(0xFF45454D)
        val description
            @Composable
            get() = Color(0xB2EEF2FB)
         val header1  @Composable
         get() = Color(0xFFEEF2FB)
         val header2  @Composable
         get()  = Color(0xFFFFFFFF)
         val category   @Composable
         get()= Color(0xFF41A0E7)
         val header3  @Composable
         get() = Color(0x66FFFFFF)
         val report  @Composable
         get() = Color(0xFFA8ADB7)
         val button  @Composable
         get() = Color(0xFF050B18)
    }
    object ButtonColors{
         val button  @Composable
         get() = Color(0xFFF4D144)
    }

    object TextStyle{
        val Bold_48
        @Composable
        get()=
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
        val Bold_20_26
        @Composable
        get()=
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
        val Bold_20
        @Composable
        get()=
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
        val Bold_16
        @Composable
        get()=
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
        val Bold_12
        @Composable
        get()=
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
        val Regular_16
        @Composable
        get()=
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
        val Regular_12
        @Composable
        get()=
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
        val Regular_12_19
        @Composable
        get()=
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
        val Regular_12_20
        @Composable
        get()=
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