package com.main.picload.repository

import com.main.picload.remote.RetrofitClient

class ImageRepository {
    private val api = RetrofitClient.api

    suspend fun fetchImages(): List<String> {
        return api.getImages().map { it.download_url }
    }
}
