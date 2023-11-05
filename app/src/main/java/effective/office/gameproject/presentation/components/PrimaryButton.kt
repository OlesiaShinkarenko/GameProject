package effective.office.gameproject.presentation.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import effective.office.gameproject.ui.theme.AppTheme

@Composable
fun PrimaryButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = AppTheme.ButtonColors.button),
        shape = RoundedCornerShape(6.dp),
        modifier = modifier,
        contentPadding = PaddingValues(
            vertical = 12.dp
        )
    ) {
        Text(
            text = text,
            style = AppTheme.TextStyle.Bold_20,
            modifier = Modifier.align(Alignment.CenterVertically),
            color = AppTheme.TextColors.buttonT
        )
    }
}