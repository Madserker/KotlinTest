package com.example.shurtado.kotlintest.model

class MarvelCharactersResponse(val data: MarvelDataResponse)

class MarvelDataResponse(
        val children: List<MarvelChildrenResponse>
        )


class MarvelChildrenResponse(val data: MarvelCharactersDataResponse)

class MarvelCharactersDataResponse(
        val id: String,
        val name: String,
        val thumbnail: String
)