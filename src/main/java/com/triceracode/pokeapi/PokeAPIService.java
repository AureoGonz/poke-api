package com.triceracode.pokeapi;

import com.triceracode.pokeapi.endpoint.berry.*;
import com.triceracode.pokeapi.endpoint.contest.*;
import com.triceracode.pokeapi.endpoint.encounter.*;
import com.triceracode.pokeapi.endpoint.evolution.*;
import com.triceracode.pokeapi.endpoint.game.*;
import com.triceracode.pokeapi.endpoint.item.*;
import com.triceracode.pokeapi.endpoint.language.*;
import com.triceracode.pokeapi.endpoint.location.*;
import com.triceracode.pokeapi.endpoint.machine.MachineEndpoint;
import com.triceracode.pokeapi.endpoint.move.*;
import com.triceracode.pokeapi.endpoint.pokemon.*;

/**
 * Help to retrieve the information from PokeApi v2 through imperative programming.
 */
public interface PokeAPIService {

    /**
     *Pokemon resource.
     *
     * @return the pokemon resource endpoint
     */
    PokemonEndpoint pokemon();

    /**
     * Ability resource.
     *
     * @return the ability resource endpoint
     */
    AbilityEndpoint ability();

    /**
     * Berry resource.
     *
     * @return the berry resource endpoint
     */
    BerryEndpoint berry();

    /**
     * Berry firmness resource.
     *
     * @return the berry firmness resource endpoint
     */
    BerryFirmnessEndpoint berryFirmness();

    /**
     * Berry flavor resource.
     *
     * @return the berry flavor resource endpoint
     */
    BerryFlavorEndpoint berryFlavor();

    /**
     * Contest type resource.
     *
     * @return the contest type resource endpoint
     */
    ContestTypeEndpoint contestType();

    /**
     * Contest effect resource.
     *
     * @return the contest effect resource endpoint
     */
    ContestEffectEndpoint contestEffect();

    /**
     * Super contest effect resource.
     *
     * @return the super contest effect resource endpoint
     */
    SuperContestEffectEndpoint superContestEffect();

    /**
     * Language resource.
     *
     * @return the language resource endpoint
     */
    LanguageEndpoint language();

    /**
     * Encounter method resource.
     *
     * @return the encounter method resource endpoint
     */
    EncounterMethodEndpoint encounterMethod();

    /**
     * Encounter condition resource.
     *
     * @return the encounter condition resource endpoint
     */
    EncounterConditionEndpoint encounterCondition();

    /**
     * Encounter condition value resource.
     *
     * @return the encounter condition value resource endpoint
     */
    EncounterConditionValueEndpoint encounterConditionValue();

    /**
     * Evolution chain resource.
     *
     * @return the evolution chain resource endpoint
     */
    EvolutionChainEndpoint evolutionChain();

    /**
     * Evolution trigger resource.
     *
     * @return the evolution trigger resource endpoint
     */
    EvolutionTriggerEndpoint evolutionTrigger();

    /**
     * Generation resource.
     *
     * @return the generation resource endpoint
     */
    GenerationEndpoint generation();

    /**
     * Pokedex resource.
     *
     * @return the pokedex resource endpoint
     */
    PokedexEndpoint pokedex();

    /**
     * Version resource.
     *
     * @return the version resource endpoint
     */
    VersionEndpoint version();

    /**
     * Version group resource.
     *
     * @return the version group resource endpoint
     */
    VersionGroupEndpoint versionGroup();

    /**
     * Item resource.
     *
     * @return the item resource endpoint
     */
    ItemEndpoint item();

    /**
     * Item attribute resource.
     *
     * @return the item attribute resource endpoint
     */
    ItemAttributeEndpoint itemAttribute();

    /**
     * Item category resource.
     *
     * @return the item category resource endpoint
     */
    ItemCategoryEndpoint itemCategory();

    /**
     * Item pocket resource.
     *
     * @return the item pocket resource endpoint
     */
    ItemPocketEndpoint itemPocket();

    /**
     * Location resource.
     *
     * @return the location resource endpoint
     */
    LocationEndpoint location();

    /**
     * Location area resource.
     *
     * @return the location area resource endpoint
     */
    LocationAreaEndpoint locationArea();

    /**
     * Pal park area resource.
     *
     * @return the pal park area resource endpoint
     */
    PalParkAreaEndpoint palParkArea();

    /**
     * Region resource.
     *
     * @return the region resource endpoint
     */
    RegionEndpoint region();

    /**
     * Machine resource.
     *
     * @return the machine resource endpoint
     */
    MachineEndpoint machine();

    /**
     * Move resource.
     *
     * @return the move resource endpoint
     */
    MoveEndpoint move();

    /**
     * Move ailment resource.
     *
     * @return the move ailment resource endpoint
     */
    MoveAilmentEndpoint moveAilment();

    /**
     * Move battle style resource.
     *
     * @return the move battle style resource endpoint
     */
    MoveBattleStyleEndpoint moveBattleStyle();

    /**
     * Move damage class resource.
     *
     * @return the move damage class resource endpoint
     */
    MoveDamageClassEndpoint moveDamageClass();

    /**
     * Move learn method resource.
     *
     * @return the move learn method resource endpoint
     */
    MoveLearnMethodEndpoint moveLearnMethod();

    /**
     * Move target resource.
     *
     * @return the move target resource endpoint
     */
    MoveTargetEndpoint moveTarget();

    /**
     * Characteristic resource.
     *
     * @return the characteristic resource endpoint
     */
    CharacteristicEndpoint characteristic();

    /**
     * Egg group resource.
     *
     * @return the egg group resource endpoint
     */
    EggGroupEndpoint eggGroup();

    /**
     * Gender resource.
     *
     * @return the gender resource endpoint
     */
    GenderEndpoint gender();

    /**
     * Growth rate resource.
     *
     * @return the growth rate resource endpoint
     */
    GrowthRateEndpoint growthRate();

    /**
     * Nature resource.
     *
     * @return the nature resource endpoint
     */
    NatureEndpoint nature();

    /**
     * Pokeathlon stat resource.
     *
     * @return the pokeathlon stat resource endpoint
     */
    PokeathlonStatEndpoint pokeathlonStat();

    /**
     * Stat resource.
     *
     * @return the stat resource endpoint
     */
    StatEndpoint stat();

    /**
     * Type resource.
     *
     * @return the type resource endpoint
     */
    TypeEndpoint type();

    /**
     * Pokemon color resource.
     *
     * @return the pokemon color resource endpoint
     */
    PokemonColorEndpoint pokemonColor();

    /**
     * Pokemon form resource.
     *
     * @return the pokemon form resource endpoint
     */
    PokemonFormEndpoint pokemonForm();

    /**
     * Pokemon habitat resource.
     *
     * @return the pokemon habitat resource endpoint
     */
    PokemonHabitatEndpoint pokemonHabitat();

    /**
     * Pokemon shape resource.
     *
     * @return the pokemon shape resource endpoint
     */
    PokemonShapeEndpoint pokemonShape();

    /**
     * Pokemon species resource.
     *
     * @return the pokemon species resource endpoint
     */
    PokemonSpeciesEndpoint pokemonSpecies();

}
