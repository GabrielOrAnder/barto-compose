package br.com.gabrielorander.barto.sample

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import br.com.gabrielorander.barto.sample.loading_button.LoadingButtonScreen
import br.com.gabrielorander.barto_compose.ui.theme.BartoTheme

class SampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context: Context = LocalContext.current
            BartoTheme {
                LoadingButtonScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BartoTheme {
        LoadingButtonScreen()
    }
}