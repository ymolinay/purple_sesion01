package com.purple.myapps01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BasicViewsLayout() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Elemento 01", modifier = Modifier.padding(8.dp))
            Text(text = "Elemento 02", modifier = Modifier.padding(8.dp))
            Text(text = "Elemento 03", modifier = Modifier.padding(8.dp))
        }
        
        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Elemento 01", modifier = Modifier.padding(8.dp))
            Text(text = "Elemento 02", modifier = Modifier.padding(8.dp))
            Text(text = "Elemento 03", modifier = Modifier.padding(8.dp))
        }

    }
}

@Composable
fun BasicViewsLayoutList() {
    val items = List(20) { "Elemento #${it + 1}" }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentPadding = PaddingValues(vertical = 8.dp),
    ) {

        items(items) { text ->
            Text(
                text = text,
                modifier = Modifier
                    .padding(vertical = 20.dp, horizontal = 16.dp)
            )
        }

    }

}

@Preview
@Composable
fun BasicViewsLayoutPreview() {
//    BasicViewsLayout()
    BasicViewsLayoutList()
}