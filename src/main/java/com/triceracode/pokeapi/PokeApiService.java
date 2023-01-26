package com.triceracode.pokeapi;

import com.triceracode.pokeapi.enpoint.ability.EndpointAbility;
import com.triceracode.pokeapi.enpoint.pokemon.EndpointPokemon;

public interface PokeApiService {

    EndpointPokemon pokemon();

    EndpointAbility ability();

}
