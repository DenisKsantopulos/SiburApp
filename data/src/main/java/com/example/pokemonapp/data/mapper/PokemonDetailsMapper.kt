package com.example.pokemonapp.data.mapper

import com.example.pokemonapp.data.entity.PokemonDetailsEntity
import com.example.pokemonapp.domain.model.PokemonDetails


object PokemonDetailsMapper : Mapper<PokemonDetailsEntity, PokemonDetails> {
    override fun map(data: PokemonDetailsEntity): PokemonDetails = PokemonDetails(
        id = data.id,
        baseExperience = data.baseExperience,
        height = data.height,
        name = data.name,
        order = data.order,
        weight = data.weight,
        stats = data.stats.map { pokemonStats -> PokemonStatsEntityMapper.map(pokemonStats) }
    )
}