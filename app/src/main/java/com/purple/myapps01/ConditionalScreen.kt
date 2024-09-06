package com.purple.myapps01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ConditionalScreen() {
    val numbers = (1..10).toList()

    Column(
        modifier = Modifier.background(Color.White)
    ) {
        numbers.forEach { number ->
            if (number % 2 == 0) {
                Text(
                    text = "Even number: $number",
                    modifier = Modifier
                        .padding(8.dp)
                        .background(Color.Cyan)
                        .padding(8.dp)
                        .background(Color.Red)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.Green)
                        .padding(8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun ConditionalScreenPreview() {
    ConditionalScreen()
}