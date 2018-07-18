package com.example.shurtado.kotlintest

class MarvelCharactersResponse(val data: MarvelDataResponse)

class MarvelDataResponse(
                val children: List<MarvelChildrenResponse>,
                val after: String?,
                val before: String?
        )

class MarvelChildrenResponse(val data: MarvelCharactersDataResponse)

class MarvelCharactersDataResponse(
        val author: String,
        val title: String,
        val num_comments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
)