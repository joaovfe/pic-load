package com.main.picload.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.main.picload.ui.ImageViewModel
import com.main.picload.ui.components.*


@Composable
fun ImageListScreen(
    viewModel: ImageViewModel = viewModel(),
    paddingValues: PaddingValues = PaddingValues(0.dp)
) {
    val images = viewModel.imageUrls.collectAsState()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        item { HeroSection(totalImages = images.value.size) }

        item {
            SectionTitle("🌟 Imagens em Destaque")
            Spacer(modifier = Modifier.height(12.dp))
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                items(images.value.take(6)) { url -> FeaturedImageCard(url) }
            }
        }

        item {
            SectionTitle("🎨 Galeria Principal")
            Spacer(modifier = Modifier.height(12.dp))
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                items(images.value.drop(6).take(20)) { url -> MediumImageCard(url) }
            }
        }

        item {
            SectionTitle("📷 Miniaturas")
            Spacer(modifier = Modifier.height(12.dp))
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                items(images.value.drop(14)) { url -> SmallImageCard(url) }
            }
        }

        item { FooterStats(totalImages = images.value.size) }
    }
}
