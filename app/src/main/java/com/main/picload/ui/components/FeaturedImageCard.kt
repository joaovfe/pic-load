package com.main.picload.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun FeaturedImageCard(url: String) {
    Card(
        modifier = Modifier
            .width(300.dp)
            .height(200.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
    ) {
        Box {
            AsyncImage(model = url, contentDescription = "Imagem em destaque", modifier = Modifier.fillMaxSize())
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.7f)),
                            startY = 100f
                        )
                    )
            )
            Card(
                modifier = Modifier.padding(12.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "⭐ DESTAQUE",
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                    color = Color.White
                )
            }
        }
    }
}
