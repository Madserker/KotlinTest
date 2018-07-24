package com.example.shurtado.kotlintest.api
import android.util.Log
import com.example.shurtado.kotlintest.Constants
import com.example.shurtado.kotlintest.api.ServiceGenerator
import com.example.shurtado.kotlintest.model.MarvelCharactersDataResponse
import com.example.shurtado.kotlintest.model.MarvelCharactersResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class CharactersManager {

    var MarvelList : List<MarvelCharactersDataResponse> = arrayListOf<MarvelCharactersDataResponse>()


    fun doRequest(){
        val call = ServiceGenerator().getCharacters("1", Constants.API_KEY, Constants.HASH)

        call.enqueue(object : Callback<MarvelCharactersResponse> {
            override fun onFailure(call: Call<MarvelCharactersResponse>?, t: Throwable?) {
                Log.e("ONFAILURE", "error")
            }

            override fun onResponse(call: Call<MarvelCharactersResponse>?, response: Response<MarvelCharactersResponse>?) {
                Log.e("ONRESPONSE", response!!.body()!!.data.toString())
                MarvelList = response!!.body()!!.data.results






            }
        })
            }



        //var marvel : Response<MarvelCharactersDataResponse>? = ServiceGenerator().marvelApi.getCharacters("","","").enqueue()
    }

