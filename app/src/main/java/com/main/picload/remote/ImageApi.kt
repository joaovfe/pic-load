package com.main.picload.remote

import com.main.picload.model.ImageResponse
import retrofit2.http.GET

interface ImageApi {
    @GET("v2/list?page=1&limit=100")
    suspend fun getImages(): List<ImageResponse>
}
