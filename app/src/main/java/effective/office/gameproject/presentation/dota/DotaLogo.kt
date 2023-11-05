package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import effective.office.gameproject.R
import effective.office.gameproject.ui.theme.AppTheme

@Composable
fun DotaLogo() {
    Image(
        modifier = Modifier
            .background(
                color = AppTheme.TextColors.buttonT
            )
            .border(
                2.dp,
                color = AppTheme.ButtonColors.border,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(
                all = 16.dp
            )
            .size(54.dp),
        painter = painterResource(id = R.drawable.logo),
        contentDescription = null
    )
}