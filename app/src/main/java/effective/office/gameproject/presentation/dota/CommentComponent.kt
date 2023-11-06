package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import effective.office.gameproject.R
import effective.office.gameproject.presentation.model.CommentUI
import effective.office.gameproject.ui.theme.AppTheme
import effective.office.gameproject.ui.theme.Padding
import effective.office.gameproject.ui.theme.Size

@Composable
fun CommentBlock(item: CommentUI, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(Size.size_36)
            ) {
                Image(
                    painter = painterResource(item.image),
                    contentDescription = stringResource(id = R.string.icon_user),
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Column(
                modifier = Modifier.padding(
                    Padding.start_16
                )
            ) {
                Text(
                    text = stringResource(item.author),
                    style = AppTheme.typography.Bold_16,
                    color = AppTheme.colors.header2,
                    modifier = Modifier.padding(Padding.bottom_6)
                )
                Text(
                    text = stringResource(item.date),
                    style = AppTheme.typography.Bold_12,
                    color = AppTheme.colors.report
                )
            }
        }
        Row(modifier = Modifier.padding(Padding.top_16_bottom_24)) {
            Text(
                text = stringResource(item.comment),
                style = AppTheme.typography.Regular_12_20,
                color = AppTheme.colors.report
            )
        }
    }
}