package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import effective.office.gameproject.R
import effective.office.gameproject.ui.theme.AppTheme
import effective.office.gameproject.ui.theme.Padding
import effective.office.gameproject.ui.theme.Shape
import effective.office.gameproject.ui.theme.Size

@Composable
fun DotaLogo() {
    Image(
        modifier = Modifier
            .background(
                color = AppTheme.TextColors.buttonT
            )
            .border(
                Size.size_2,
                color = AppTheme.ButtonColors.border,
                shape = Shape.ellipse_12
            )
            .padding(
                Padding.all_16
            )
            .size(Size.size_54),
        painter = painterResource(id = R.drawable.logo),
        contentDescription = null
    )
}