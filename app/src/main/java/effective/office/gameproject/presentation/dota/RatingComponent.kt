package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import effective.office.gameproject.R
import effective.office.gameproject.ui.theme.AppTheme
import effective.office.gameproject.ui.theme.Padding
import effective.office.gameproject.ui.theme.Size

@Composable
fun RatingComponent(text: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Text(
            text = text,
            style = AppTheme.typography.Bold_48,
            color = AppTheme.colors.header1
        )
        Column(
            modifier = Modifier
                .padding(Padding.start_16)
                .align(Alignment.CenterVertically),
        ) {
            Stars(rating = 4.9, modifier = Modifier.size(Size.size_16))
            Text(
                text = stringResource(id = R.string.count_review),
                modifier = Modifier.padding(Padding.top_8),
                style = AppTheme.typography.Regular_12,
                color = AppTheme.colors.report
            )
        }
    }
}

@Composable
fun Stars(modifier: Modifier = Modifier, rating: Double = 0.0, stars: Int = 5) {
    var isHalfStar = (rating % 1) != 0.0
    Row {
        for (index in 1..stars) {
            Icon(
                imageVector = if (index <= rating) {
                    ImageVector.vectorResource(id = R.drawable.star)
                } else {
                    if (isHalfStar) {
                        isHalfStar = false
                        ImageVector.vectorResource(id = R.drawable.star_half)
                    } else {
                        ImageVector.vectorResource(id = R.drawable.star_empty)
                    }
                },
                contentDescription = null,
                tint = AppTheme.colors.button,
                modifier = modifier
            )
        }
    }
}
