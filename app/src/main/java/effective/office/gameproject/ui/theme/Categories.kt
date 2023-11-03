package effective.office.gameproject.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun CategoriesRow(resList: List<Int>, contentPadding: PaddingValues, modifier: Modifier = Modifier) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = contentPadding,
        modifier = modifier,
    ){
        items(resList){
                item->
            Category(
                item = item,
            )
        }
    }
}

@Composable
fun Category(item: Int) {
    Text(
        text = stringResource(id = item),
        modifier = Modifier.background(color = AppTheme.ButtonColors.categoryB, shape = RoundedCornerShape(12.dp)).padding(horizontal = 10.dp, vertical = 5.dp),
        color = AppTheme.TextColors.category,
        style = AppTheme.TextStyle.Medium
    )
}
