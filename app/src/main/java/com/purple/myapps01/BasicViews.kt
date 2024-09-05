package com.purple.myapps01

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BasicViews() {

    Text(text = "Hola Mundo!")

    Image(
        painter = painterResource(id = R.drawable.bcplogo),
        contentDescription = "Descripción de la imagen"
    )

    Button(onClick = {}) {
        Text(text = "click")
    }

    TextField(value = "", onValueChange = {})

    Row {
        Checkbox(
            checked = true,
            onCheckedChange = { }
        )
        Text(text = "Aceptar términos y condiciones")
    }

    // RadioButton
    val radioOptions = listOf("Opción 1", "Opción 2", "Opción 3")
    radioOptions.forEach { text ->
        Row {
            RadioButton(
                selected = false,
                onClick = { }
            )
            Text(text)
        }
    }

    // Switch
    Row {
        Switch(
            checked = false,
            onCheckedChange = { }
        )
        Text("Encendido")
    }

}

@Preview
@Composable
fun BasicViewsPreview() {
    Column(Modifier.background(Color.White)) {
        BasicViews()
    }
}