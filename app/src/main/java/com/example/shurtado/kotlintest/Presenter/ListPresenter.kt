package com.example.shurtado.kotlintest.Presenter

import android.util.Log
import com.example.shurtado.kotlintest.Constants
import com.example.shurtado.kotlintest.Fragment1
import com.example.shurtado.kotlintest.FragmentView
import com.example.shurtado.kotlintest.api.ServiceGenerator
import com.example.shurtado.kotlintest.model.MarvelCharactersDataResponse
import com.example.shurtado.kotlintest.model.MarvelCharactersResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListPresenter(var listView : FragmentView){


    fun doRequest(){
        val call = ServiceGenerator().getCharacters("1", Constants.API_KEY, Constants.HASH, 100)

        call.enqueue(object : Callback<MarvelCharactersResponse> {
            override fun onFailure(call: Call<MarvelCharactersResponse>?, t: Throwable?) {
                Log.e("ONFAILURE", "error")

            }

            override fun onResponse(call: Call<MarvelCharactersResponse>?, response: Response<MarvelCharactersResponse>?) {
                Log.e("ONRESPONSE", response!!.body()!!.data.toString())
                listView.showList(response!!.body()!!.data.results)






            }
        })
    }






}