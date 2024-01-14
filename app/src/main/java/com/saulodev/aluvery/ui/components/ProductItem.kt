package com.saulodev.aluvery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saulodev.aluvery.R
import com.saulodev.aluvery.extensions.toBrazilianCurrency
import com.saulodev.aluvery.model.Product
import com.saulodev.aluvery.ui.theme.Purple40
import com.saulodev.aluvery.ui.theme.Purple80
import java.math.BigDecimal

@Composable
fun ProductItem(product: Product) {
    Surface(
        shape = RoundedCornerShape(15),
        shadowElevation = 4.dp,
        //modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
            //.clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
        ) {

            val imageSize = 100.dp

            Box(
                modifier = Modifier
                    .height(imageSize)
                    .background(Color.Blue)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple40,
                                Purple80
                            )
                        )
                    )

            ) {
                Image(
                    painter = painterResource(id = product.image),
                    contentDescription = null,
                    Modifier.run {
                        size(imageSize)
                            .offset(y = imageSize / 2)
                            .clip(shape = CircleShape)
                            .align(Alignment.BottomCenter)
                    },
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(imageSize / 2))

            Column(
                Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = product.name,
                    //modifier = Modifier.padding(16.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Clip
                )

                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = product.price.toBrazilianCurrency(),
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400)
                )

            }
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.Blue)
                    .fillMaxWidth(),
                text = LoremIpsum(100).values.first()
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewProductItem() {
    ProductItem(Product("Bola", BigDecimal(10.40), R.drawable.placeholder))
}