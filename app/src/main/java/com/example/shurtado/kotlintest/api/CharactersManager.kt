package com.example.shurtado.kotlintest.api

import android.util.Log
import com.example.shurtado.kotlintest.Constants
import com.example.shurtado.kotlintest.model.MarvelCharactersDataResponse
import com.example.shurtado.kotlintest.model.MarvelCharactersResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CharactersManager {

    fun doRequest(){
        val call = ServiceGenerator().getCharacters("1", Constants.API_KEY,Constants.HASH)

        call.enqueue(object : Callback<MarvelCharactersResponse> {
            override fun onFailure(call: Call<MarvelCharactersResponse>?, t: Throwable?) {
                Log.e("ONFAILURE", "error")
            }

            override fun onResponse(call: Call<MarvelCharactersResponse>?, response: Response<MarvelCharactersResponse>?) {
                Log.e("ONRESPONSE", response!!.body()!!.data.toString())

                        /*.map {
                    val item = it.data
                    Log.e("ONRESPONSE",item.name)
                    MarvelCharactersDataResponse(item.id, item.name, item.thumbnail)
                }*/

            }
        })
            }



        //var marvel : Response<MarvelCharactersDataResponse>? = ServiceGenerator().marvelApi.getCharacters("","","").enqueue()
    }

