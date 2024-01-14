package com.saulodev.aluvery.sampledata

import com.saulodev.aluvery.R
import com.saulodev.aluvery.model.Product
import com.saulodev.aluvery.ui.components.ProductItem
import java.math.BigDecimal

val sampledataproduct = listOf(
    Product("Hamburgueger", BigDecimal(10.40), R.drawable.burger),
            Product("Pizza", BigDecimal(10.40), R.drawable.pizza),
            Product("Batata Frita", BigDecimal(10.40), R.drawable.fries)
)