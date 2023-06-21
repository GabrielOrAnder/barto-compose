package br.com.gabrielorander.barto_compose.loading_button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoadingButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp),
        onClick = onClick
    ) {
        Text(text = label)
    }
}

@Preview(showBackground = true)
@Composable
fun LoadingButtonPreview() {
    LoadingButton(label = "Button", onClick = {})
}