package com.main.picload.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val api: ImageApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://picsum.photos/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ImageApi::class.java)
    }
}
