package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import effective.office.gameproject.R
import effective.office.gameproject.ui.theme.AppTheme
import effective.office.gameproject.ui.theme.Padding
import effective.office.gameproject.ui.theme.Size

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
            Column(modifier = Modifier.padding(Padding.start_16_top_32)) {
                Text(
                    text = stringResource(id = R.string.header),
                    style = AppTheme.typography.Bold_20_26,
                    color = AppTheme.colors.header2
                )
                Row(modifier = Modifier.padding(Padding.top_8)) {
                    Stars(width = Size.size_70)
                    Text(
                        modifier = Modifier.padding(Padding.start_8),
                        text = stringResource(id = R.string.count_download),
                        style = AppTheme.typography.Regular_12,
                        color = AppTheme.colors.count
                    )
                }
            }
        }

    }
}