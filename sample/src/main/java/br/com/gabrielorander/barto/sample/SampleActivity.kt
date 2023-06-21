package br.com.gabrielorander.barto.sample

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.gabrielorander.barto_compose.loading_button.LoadingButton
import br.com.gabrielorander.barto_compose.ui.theme.BartoTheme

class SampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context: Context = LocalContext.current
            BartoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoadingButton(
                        modifier = Modifier.wrapContentHeight(),
                        label = "My Button",
                        onClick = { Toast.makeText(context, "Hello Compose", Toast.LENGTH_SHORT).show() }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BartoTheme {
        val context: Context = LocalContext.current
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.surface
        ) {
            LoadingButton(
                label = "My Button",
                onClick = { Toast.makeText(context, "Hello Compose", Toast.LENGTH_SHORT).show() }
            )
        }
    }
}