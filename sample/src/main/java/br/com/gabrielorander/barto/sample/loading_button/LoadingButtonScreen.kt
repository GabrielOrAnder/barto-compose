package br.com.gabrielorander.barto.sample.loading_button

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.gabrielorander.barto_compose.loading_button.LoadingButton

@Composable
fun LoadingButtonScreen() {
    val context = androidx.compose.ui.platform.LocalContext.current
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(modifier = Modifier.padding(16.dp)) {
            LoadingButton(
                label = "My Button",
                onClick = {
                    Toast.makeText(context, "Hello Compose", Toast.LENGTH_SHORT).show()
                }
            )
        }
    }
}