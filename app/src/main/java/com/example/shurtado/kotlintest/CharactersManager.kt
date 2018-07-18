package com.example.shurtado.kotlintest

import kotlinx.android.synthetic.main.fragment_fragment2.*

class CharactersManager(){



    fun getCharacters(): String {



        val api : RestApi = RestApi()
        var characters = api.getCharacters("","1")
        val response = characters.execute()


        return response.body()!!.data.children[0].data.title
    }


}