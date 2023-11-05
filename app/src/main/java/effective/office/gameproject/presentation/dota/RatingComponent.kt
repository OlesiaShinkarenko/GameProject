package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import effective.office.gameproject.R
import effective.office.gameproject.ui.theme.AppTheme

@Composable
fun RatingComponent(text: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = text,
            style = AppTheme.TextStyle.Bold_48,
            color = AppTheme.TextColors.header2
        )
        Column(
            modifier = Modifier.padding(start = 16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Stars(width = 100.dp)
            Text(
                text = stringResource(id = R.string.count_review),
                modifier = Modifier.padding(top = 8.dp),
                style = AppTheme.TextStyle.Regular_12,
                color = AppTheme.TextColors.report
            )
        }
    }
}

@Composable
fun Stars(width: Dp) {
    Image(
        modifier = Modifier.width(width = width),
        painter = painterResource(id = R.drawable.stars),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}