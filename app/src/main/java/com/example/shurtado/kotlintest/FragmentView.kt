package com.example.shurtado.kotlintest

import com.example.shurtado.kotlintest.model.MarvelCharactersDataResponse

interface FragmentView {

    fun showList(marvelList : List<MarvelCharactersDataResponse>)
}