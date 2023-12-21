package com.saulodev.aluvery

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.saulodev.aluvery.ui.theme.AluveryTheme
import com.saulodev.aluvery.ui.theme.Purple40
import com.saulodev.aluvery.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //ProductItem()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ProductItem() {
    Column(
        modifier = Modifier
            .height(250.dp)
            .width(200.dp)
            .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(Color.Blue)
                .fillMaxWidth()
                .background(brush = Brush.horizontalGradient(listOf(Purple40, Purple80)))
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                Modifier.run {
                    size(100.dp)
                        .offset(y = (50.dp))
                        .clip(shape = CircleShape)
                        .align(BottomCenter)
                }
                //Modifier.clip(CircleShape)
            )
        }

        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

/*

DESAFIO DA AULA 02 FAÇA COMO EU
@Preview(showBack round = true)
@Composable
fun PrevDesafio() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {
        Box(modifier = Modifier
            .fillMaxHeight()
            .width(100.dp)
            .background(Color.Blue))

        Column {
            Text(
                "Test 1",
                Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFededed))
                    .padding(16.dp)
            )
            Text("Test 2", Modifier.padding(16.dp))
        }
    }
*/



