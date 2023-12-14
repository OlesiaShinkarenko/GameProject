package effective.office.gameproject.presentation.dota

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import effective.office.gameproject.ui.theme.Size

@Composable
fun CategoriesRow(
    resList: List<Int>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(Size.size_16),
        modifier = modifier,
    ) {
        items(resList) { item ->
            CategoryComponent(
                item = item,
            )
        }
    }
}

