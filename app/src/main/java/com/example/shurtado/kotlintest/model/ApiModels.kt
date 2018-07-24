package com.example.shurtado.kotlintest.model

class MarvelCharactersResponse(val data: MarvelDataResponse)



class MarvelDataResponse(
        val results: List<MarvelCharactersDataResponse>
)

class MarvelCharactersDataResponse(
        val id: String,
        val name: String,
        val thumbnail: MarvelCharacterPhoto
)

class MarvelCharacterPhoto(
        val path: String,
        val extension: String
)