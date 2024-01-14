package com.saulodev.aluvery.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saulodev.aluvery.model.Product
import com.saulodev.aluvery.sampledata.sampledataproduct

@Composable
fun ProductsSection(
    title: String,
    products: List<Product>
) {
    Column {
        Text(
            text = title,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
            fontWeight = FontWeight(700),
            fontSize = 20.sp
        )

        Row(
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            for(p in products) {
                ProductItem(product = p)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewProductsSection() {
    ProductsSection("Test" ,sampledataproduct)
}