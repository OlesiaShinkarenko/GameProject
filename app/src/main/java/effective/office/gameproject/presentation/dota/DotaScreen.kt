package effective.office.gameproject.presentation.dota

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import effective.office.gameproject.R
import effective.office.gameproject.presentation.components.PrimaryButton
import effective.office.gameproject.presentation.model.CommentUI
import effective.office.gameproject.ui.theme.AppTheme
import effective.office.gameproject.ui.theme.Padding
import effective.office.gameproject.ui.theme.Size

@Composable
fun DotaScreen() {
    val context = LocalContext.current
    val lazyListState = rememberLazyListState()
    val comments = listOf(
        CommentUI(
            author = R.string.user1,
            image = R.drawable.avatar1,
            date = R.string.date,
            comment = R.string.comment
        ),
        CommentUI(
            author = R.string.user2,
            image = R.drawable.avatar2,
            date = R.string.date,
            comment = R.string.comment
        )
    )


    LazyColumn(
        state = lazyListState,
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            DotaScreenHeader(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Padding.bottom_40)
            )
        }
        item {
            CategoriesRow(
                resList = listOf(
                    R.string.categories1,
                    R.string.categories2,
                    R.string.categories3
                ),
                contentPadding = Padding.horizontal_24
            )
        }
        item {
            Text(
                text = stringResource(id = R.string.description),
                style = AppTheme.typography.Regular_12_19,
                color = AppTheme.colors.description,
                modifier = Modifier.padding(Padding.all_24_24_14_14)
            )
        }
        item {
            VideoPreviewRow(
                previewResList = listOf(
                    R.drawable.video_preview1,
                    R.drawable.video_preview2
                ),
                contentPadding = Padding.horizontal_24
            )
        }
        item {
            Text(
                text = stringResource(id = R.string.review),
                style = AppTheme.typography.Bold_16,
                color = AppTheme.colors.header2,
                modifier = Modifier.padding(
                    Padding.all_24_24_20_12
                )
            )
        }
        item {
            RatingComponent(
                text = stringResource(id = R.string.rate),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        Padding.horizontal_24
                    )
            )
        }
        itemsIndexed(comments) { index, item ->
            CommentBlock(
                item,
                modifier = Modifier.padding(
                    Padding.start_end_24_top_16
                )
            )
            if (index < comments.lastIndex) {
                Divider(
                    color = AppTheme.colors.divider,
                    thickness = Size.size_1,
                    modifier = Modifier.padding(Padding.top_12_bottom_10)
                )
            }
        }
        item {
            PrimaryButton(
                text = stringResource(id = R.string.install),
                onClick = {
                    Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        Padding.all_24_24_20_60
                    )
            )
        }
    }
}

@Preview
@Composable
fun DotaScreenHeaderPreview() {
    Surface(
        color = AppTheme.colors.primary
    ) {
        DotaScreenHeader()
    }
}