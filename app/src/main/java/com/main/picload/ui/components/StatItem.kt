package com.main.picload.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun StatItem(icon: String, value: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = icon, fontSize = 24.sp)
        Text(
            text = value,
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSecondaryContainer.copy(alpha = 0.7f)
        )
    }
}
