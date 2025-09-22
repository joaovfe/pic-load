package com.main.picload.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FooterStats(totalImages: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondaryContainer)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            StatItem(icon = "📊", value = "$totalImages", label = "Imagens")
            StatItem(icon = "🎯", value = "3", label = "Seções")
            StatItem(icon = "⚡", value = "Fast", label = "Loading")
        }
    }
}
