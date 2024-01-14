package com.saulodev.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.saulodev.aluvery.ui.HomeScreen
import com.saulodev.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    AluveryTheme {
        // A surface container using the 'background' color from the theme
        Surface {
            HomeScreen()
        }
    }
}
@Composable
@Preview(showSystemUi = true)
fun PreviewApp() {
    App()
}



