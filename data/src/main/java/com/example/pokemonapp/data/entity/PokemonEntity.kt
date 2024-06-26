package com.example.pokemonapp.data.entity

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class PokemonEntity(
    val name: String,
    val url: String,
)
