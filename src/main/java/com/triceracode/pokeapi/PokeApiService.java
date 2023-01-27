package com.triceracode.pokeapi;

import com.triceracode.pokeapi.enpoint.ability.AbilityEndpoint;
import com.triceracode.pokeapi.enpoint.berry.BerryEndpoint;
import com.triceracode.pokeapi.enpoint.berry.firmness.BerryFirmnessEndpoint;
import com.triceracode.pokeapi.enpoint.berry.flavor.BerryFlavorEndpoint;
import com.triceracode.pokeapi.enpoint.contest.effect.ContestEffectEndpoint;
import com.triceracode.pokeapi.enpoint.contest.supereffect.SuperContestEffectEndpoint;
import com.triceracode.pokeapi.enpoint.contest.type.ContestTypeEndpoint;
import com.triceracode.pokeapi.enpoint.pokemon.PokemonEndpoint;

public interface PokeApiService {

    PokemonEndpoint pokemon();

    AbilityEndpoint ability();

    BerryEndpoint berry();

    BerryFirmnessEndpoint berryFirmness();

    BerryFlavorEndpoint berryFlavor();

    ContestTypeEndpoint contestType();

    ContestEffectEndpoint contestEffect();

    SuperContestEffectEndpoint superContestEffect();

}
