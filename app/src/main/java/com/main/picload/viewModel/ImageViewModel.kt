package com.main.picload.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.main.picload.repository.ImageRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ImageViewModel(
    private val repository: ImageRepository = ImageRepository()
) : ViewModel() {

    private val _imageUrls = MutableStateFlow<List<String>>(emptyList())
    val imageUrls: StateFlow<List<String>> = _imageUrls

    init {
        loadImages()
    }

    private fun loadImages() {
        viewModelScope.launch {
            try {
                val urls = repository.fetchImages()
                _imageUrls.value = urls
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
