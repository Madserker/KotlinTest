package com.example.shurtado.kotlintest.api

import com.example.shurtado.kotlintest.model.MarvelCharactersDataResponse
import com.example.shurtado.kotlintest.model.MarvelCharactersResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApi{

    @GET("/v1/public/characters")
    fun getCharacters(
            @Query("ts") timestamp : String,
            @Query("apikey") apikey : String,
            @Query("hash") hash : String,
            @Query("limit") limit : Int)
            : Call<MarvelCharactersResponse>
}



