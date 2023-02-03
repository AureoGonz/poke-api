package com.triceracode.pokeapi;

import com.triceracode.pokeapi.endpoint.berry.*;
import com.triceracode.pokeapi.endpoint.contest.*;
import com.triceracode.pokeapi.endpoint.encounter.*;
import com.triceracode.pokeapi.endpoint.evolution.*;
import com.triceracode.pokeapi.endpoint.game.*;
import com.triceracode.pokeapi.endpoint.item.*;
import com.triceracode.pokeapi.endpoint.language.*;
import com.triceracode.pokeapi.endpoint.pokemon.*;

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

    EvolutionChainEndpoint evolutionChain();

    EvolutionTriggerEndpoint evolutionTrigger();

    GenerationEndpoint generation();

    PokedexEndpoint pokedex();

    VersionEndpoint version();

    VersionGroupEndpoint versionGroup();

    ItemEndpoint item();

    ItemAttributeEndpoint itemAttribute();

    ItemCategoryEndpoint itemCategory();

    ItemPocketEndpoint itemPocket();

}
