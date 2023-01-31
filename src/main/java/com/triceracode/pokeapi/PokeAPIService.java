package com.triceracode.pokeapi;

import com.triceracode.pokeapi.endpoint.ability.AbilityEndpoint;
import com.triceracode.pokeapi.endpoint.berry.BerryEndpoint;
import com.triceracode.pokeapi.endpoint.berry.BerryFirmnessEndpoint;
import com.triceracode.pokeapi.endpoint.berry.BerryFlavorEndpoint;
import com.triceracode.pokeapi.endpoint.contest.ContestEffectEndpoint;
import com.triceracode.pokeapi.endpoint.contest.SuperContestEffectEndpoint;
import com.triceracode.pokeapi.endpoint.contest.ContestTypeEndpoint;
import com.triceracode.pokeapi.endpoint.encounter.EncounterConditionEndpoint;
import com.triceracode.pokeapi.endpoint.encounter.EncounterConditionValueEndpoint;
import com.triceracode.pokeapi.endpoint.encounter.EncounterMethodEndpoint;
import com.triceracode.pokeapi.endpoint.language.LanguageEndpoint;
import com.triceracode.pokeapi.endpoint.pokemon.PokemonEndpoint;

public interface PokeAPIService {

    PokemonEndpoint pokemon();

    AbilityEndpoint ability();

    BerryEndpoint berry();

    BerryFirmnessEndpoint berryFirmness();

    BerryFlavorEndpoint berryFlavor();

    ContestTypeEndpoint contestType();

    ContestEffectEndpoint contestEffect();

    SuperContestEffectEndpoint superContestEffect();

    LanguageEndpoint language();

    EncounterMethodEndpoint encounterMethod();

    EncounterConditionEndpoint encounterCondition();

    EncounterConditionValueEndpoint encounterConditionValue();

}
