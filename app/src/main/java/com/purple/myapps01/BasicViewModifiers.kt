package com.purple.myapps01

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BasicViewsModifiers() {

    Column(Modifier.background(Color.White)) {

        Text(
            text = "Hola Mundo!",
            modifier = Modifier
                .padding(8.dp)
                .background(Color.LightGray)
                .border(1.dp, Color.Gray)
                .padding(8.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.bcplogo),
            contentDescription = "Descripción de la imagen",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color.LightGray)
                .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                .padding(8.dp)
        )

        TextField(
            value = "Usuario",
            label = { Text(text = "Nombre de usuario") },
            onValueChange = {},
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                focusedLabelColor = Color.Black,
                cursorColor = Color.Black
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .border(2.dp, Color.Gray, RoundedCornerShape(8.dp))
                .background(Color.LightGray, RoundedCornerShape(8.dp))
                .padding(vertical = 4.dp)
        )

        Button(
            onClick = {},
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth()
        ) {
            Text(text = "click")
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = true,
                onCheckedChange = { }
            )
            Text(text = "Aceptar términos y condiciones")
        }

        // RadioButton
        val radioOptions = listOf("Opción 1", "Opción 2", "Opción 3")
        radioOptions.forEach { text ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = false,
                    onClick = { }
                )
                Text(text)
            }
        }

        // Switch
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Switch(
                checked = false,
                onCheckedChange = { },
            )
            Text(
                "Encendido",
                modifier = Modifier
                    .padding(start = 8.dp)
            )
        }

    }

}

@Preview
@Composable
fun BasicViewsModifiersPreview() {
    Column(Modifier.background(Color.White)) {
        BasicViewsModifiers()
    }
}