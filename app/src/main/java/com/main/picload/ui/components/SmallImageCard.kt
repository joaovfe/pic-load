package com.main.picload.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun SmallImageCard(url: String) {
    Card(
        modifier = Modifier.size(80.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        AsyncImage(
            model = url,
            contentDescription = "Miniatura",
            modifier = Modifier.fillMaxSize()
        )
    }
}
