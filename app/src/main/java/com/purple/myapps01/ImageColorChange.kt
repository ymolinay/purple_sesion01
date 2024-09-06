package com.purple.myapps01

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ImageColorChangeOnClick() {
    var borderColor by remember { mutableStateOf(Color.Gray) }
    var backgroundColor by remember { mutableStateOf(Color.White) }

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            borderColor = if (borderColor == Color.Gray) Color.Green else Color.Gray
            backgroundColor = if (backgroundColor == Color.White) Color.LightGray else Color.White
        }) {
            Text("Cambiar color de imagen")
        }

        Image(
            painter = painterResource(id = R.drawable.bcplogo),
            contentDescription = "Descripción de la imagen",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(2.dp, borderColor, RoundedCornerShape(8.dp))
                .background(backgroundColor)
                .padding(8.dp)
        )
    }
}

@Preview
@Composable
fun ImageColorChangeOnClickPreview() {
    ImageColorChangeOnClick()
}