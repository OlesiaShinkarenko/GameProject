package effective.office.gameproject.ui.theme

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import effective.office.gameproject.R

@Composable
fun DotaScreen() {
   val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier.fillMaxSize()){
        item {
            DotaScreenHeader(modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 40.dp))
        }
        item {
            Text(
                text = stringResource(id = R.string.description),
                style = AppTheme.TextStyle.Regular_12_19,
                color = AppTheme.TextColors.description,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 14.dp,
                    bottom = 14.dp
                )
            )
        }
        item {
            VideoPreviewRow(
                previewResList = listOf(
                    R.drawable.video_preview1,
                    R.drawable.video_preview2
                ),
                contentPadding = PaddingValues(start =24.dp, end = 24.dp )
            )
        }
        item{
            Text(text = stringResource(id = R.string.review),
                style = AppTheme.TextStyle.Bold_16,
                color = AppTheme.TextColors.header2,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 20.dp,
                    bottom = 12.dp
                )
                )
        }
        val comments = listOf(
            CommentUI(
                author =  R.string.user1,
                image = R.drawable.avatar1,
                date= R.string.date,
                comment = R.string.comment
            ),
            CommentUI(
                author =  R.string.user2,
                image = R.drawable.avatar2,
                date= R.string.date,
                comment = R.string.comment
            )
        )
        itemsIndexed(comments){
            index, item ->
            CommentBlock(
                item,
                modifier = Modifier.
                padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 16.dp
                )
            )
            if(index< comments.lastIndex){
                Divider(
                    color = AppTheme.BgColors.divider,
                    thickness = 1.dp,
                    modifier = Modifier.padding(top = 12.dp, bottom = 10.dp)
                )
            }
        }
        item{
            PrimaryButton(
                text = stringResource(id = R.string.install),
                onClick ={
                    Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 20.dp,
                        bottom = 40.dp
                    )
            )
        }
    }
}


@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier,
) {
    HeaderBackground(
        painter = painterResource(id = R.drawable.bg_header),
        modifier = modifier
    ){
            DotaLogo()
    }
}

@Composable
fun DotaLogo() {
        Image(
            modifier = Modifier
                .background(
                    color = AppTheme.TextColors.button
                )
                .border(
                    2.dp,
                    color = AppTheme.ButtonColors.border,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(
                    all = 16.dp
                )
                .size(54.dp),
            painter = painterResource(id = R.drawable.logo), contentDescription =null )
}

@Composable
fun HeaderBackground(painter: Painter, modifier: Modifier = Modifier, content : @Composable () -> Unit) {
    Box(modifier = modifier){
            Image(
                modifier = modifier,
                contentScale = ContentScale.FillWidth,
                painter = painter,
                contentDescription = null
            )

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .graphicsLayer {
                    translationY = 160f
                }
                .padding(horizontal = 21.dp)
                .padding(bottom = 40.dp),
        ) { content() }
    }
}


@Preview
@Composable
fun DotaScreenHeaderPreview(){
    Surface(
        color = AppTheme.BgColors.primary
    ){
        DotaScreenHeader()
    }
}