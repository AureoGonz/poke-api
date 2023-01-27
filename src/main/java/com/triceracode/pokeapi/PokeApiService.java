package com.triceracode.pokeapi;

import com.triceracode.pokeapi.endpoint.ability.AbilityEndpoint;
import com.triceracode.pokeapi.endpoint.berry.BerryEndpoint;
import com.triceracode.pokeapi.endpoint.berry.firmness.BerryFirmnessEndpoint;
import com.triceracode.pokeapi.endpoint.berry.flavor.BerryFlavorEndpoint;
import com.triceracode.pokeapi.endpoint.contest.effect.ContestEffectEndpoint;
import com.triceracode.pokeapi.endpoint.contest.supereffect.SuperContestEffectEndpoint;
import com.triceracode.pokeapi.endpoint.contest.type.ContestTypeEndpoint;
import com.triceracode.pokeapi.endpoint.language.LanguageEndpoint;
import com.triceracode.pokeapi.endpoint.pokemon.PokemonEndpoint;

public interface PokeApiService {

    PokemonEndpoint pokemon();

    AbilityEndpoint ability();

    BerryEndpoint berry();

    BerryFirmnessEndpoint berryFirmness();

    BerryFlavorEndpoint berryFlavor();

    ContestTypeEndpoint contestType();

    ContestEffectEndpoint contestEffect();

    SuperContestEffectEndpoint superContestEffect();

    LanguageEndpoint language();

}
