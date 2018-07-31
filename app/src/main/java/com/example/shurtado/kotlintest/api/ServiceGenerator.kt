package com.example.shurtado.kotlintest.api

import com.example.shurtado.kotlintest.Constants
import com.example.shurtado.kotlintest.model.MarvelCharactersDataResponse
import com.example.shurtado.kotlintest.model.MarvelCharactersResponse
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

class ServiceGenerator {
    val marvelApi: MarvelApi

    init {

        val builder = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()


        marvelApi = builder.create(MarvelApi::class.java)
}

    fun getCharacters(ts:String,apikey:String,hash:String,limit: Int) : Call<MarvelCharactersResponse>{
        return marvelApi.getCharacters(ts,apikey,hash,limit)
    }













/*
    private val marvelApi: MarvelApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://www.reddit.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        marvelApi = retrofit.create(MarvelApi::class.java)
    }

    fun getCharacters(after: String, limit: String): Call<MarvelCharactersResponse> {
        return marvelApi.getTop(after, limit)
    }
    */
}