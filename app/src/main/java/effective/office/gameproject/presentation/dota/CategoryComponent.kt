package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import effective.office.gameproject.ui.theme.AppTheme
import effective.office.gameproject.ui.theme.Padding
import effective.office.gameproject.ui.theme.Shape

@Composable
fun CategoryComponent(item: Int) {
    Text(
        text = stringResource(id = item),
        modifier = Modifier
            .background(
                color = AppTheme.ButtonColors.categoryB,
                shape = Shape.ellipse_12
            )
            .padding(Padding.horizontal_10_vertical_5),
        color = AppTheme.TextColors.category,
        style = AppTheme.TextStyle.Medium
    )
}