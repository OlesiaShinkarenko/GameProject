package effective.office.gameproject.presentation.components

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import effective.office.gameproject.ui.theme.AppTheme
import effective.office.gameproject.ui.theme.Padding
import effective.office.gameproject.ui.theme.Shape

@Composable
fun PrimaryButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = AppTheme.colors.button),
        shape = Shape.ellipse_6,
        modifier = modifier,
        contentPadding = Padding.vertical_12
    ) {
        Text(
            text = text,
            style = AppTheme.typography.Bold_20,
            modifier = Modifier.align(Alignment.CenterVertically),
            color = AppTheme.colors.buttonT
        )
    }
}