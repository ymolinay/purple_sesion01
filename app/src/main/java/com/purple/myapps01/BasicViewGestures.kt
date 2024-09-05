package com.purple.myapps01

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BasicViewGestures() {

    Column {

        var countClick by remember { mutableStateOf(0) }
        Text(
            text = "Clicks: $countClick",
            modifier = Modifier
                .padding(8.dp)
                .background(Color.Cyan)
                .clickable { countClick++ }
                .padding(8.dp)
        )

        var message by remember { mutableStateOf("Usa un evento") }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .heightIn(100.dp)
                .background(Color.Cyan)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onTap = {
                            message = "Clic corto"
                        },
                        onLongPress = {
                            message = "clic largo"
                        }
                    )
                }
        ) {
            Text(
                text = message,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }

    }

}

@Preview
@Composable
fun BasicViewGesturesPreview() {
    BasicViewGestures()
//    ScrollableExample()
}