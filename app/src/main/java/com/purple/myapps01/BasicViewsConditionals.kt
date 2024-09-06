package com.purple.myapps01

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BasicViewsConditionals() {

    var isVisible by remember { mutableStateOf(true) }

    Column {
        Button(onClick = { isVisible = !isVisible }) {
            Text("Ocultar")
        }
        if (isVisible) {
            Text("Hola Mundo!", Modifier.padding(16.dp))
        }
    }

}

@Preview
@Composable
fun BasicViewsConditionalsPreview() {
    BasicViewsConditionals()
}