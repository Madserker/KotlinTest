package com.example.shurtado.kotlintest

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RestApi {

    private val marvelApi: MarvelApiService

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://www.reddit.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        marvelApi = retrofit.create(MarvelApiService::class.java)
    }

    fun getCharacters(after: String, limit: String): Call<MarvelCharactersResponse> {
        return marvelApi.getTop(after, limit)
    }
}