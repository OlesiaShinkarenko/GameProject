package effective.office.gameproject.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
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
            DotaScreenHeader(modifier = Modifier.fillMaxWidth())
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
                .padding(horizontal = 21.dp),
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