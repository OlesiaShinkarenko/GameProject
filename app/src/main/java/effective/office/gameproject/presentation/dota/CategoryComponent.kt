package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import effective.office.gameproject.ui.theme.AppTheme

@Composable
fun CategoryComponent(item: Int) {
    Text(
        text = stringResource(id = item),
        modifier = Modifier
            .background(
                color = AppTheme.ButtonColors.categoryB,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(horizontal = 10.dp, vertical = 5.dp),
        color = AppTheme.TextColors.category,
        style = AppTheme.TextStyle.Medium
    )
}