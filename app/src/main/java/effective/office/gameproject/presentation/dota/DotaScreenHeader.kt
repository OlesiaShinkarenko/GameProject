package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import effective.office.gameproject.R
import effective.office.gameproject.ui.theme.AppTheme

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier,
) {
    HeaderBackground(
        painter = painterResource(id = R.drawable.bg_header),
        modifier = modifier
    ) {
        Row {
            DotaLogo()
            Column(modifier = Modifier.padding(start = 16.dp, top = 32.dp)) {
                Text(
                    text = stringResource(id = R.string.header),
                    style = AppTheme.TextStyle.Bold_20_26,
                    color = AppTheme.TextColors.header2
                )
                Row(modifier = Modifier.padding(top = 8.dp)) {
                    Stars(width = 70.dp)
                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = stringResource(id = R.string.count_download),
                        style = AppTheme.TextStyle.Regular_12,
                        color = AppTheme.TextColors.count
                    )
                }
            }
        }

    }
}