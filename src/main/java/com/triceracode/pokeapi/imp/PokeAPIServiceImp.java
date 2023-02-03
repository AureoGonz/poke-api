package com.triceracode.pokeapi.imp;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.triceracode.pokeapi.PokeAPIService;
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
import com.triceracode.pokeapi.endpoint.evolution.EvolutionChainEndpoint;
import com.triceracode.pokeapi.endpoint.evolution.EvolutionTriggerEndpoint;
import com.triceracode.pokeapi.endpoint.game.GenerationEndpoint;
import com.triceracode.pokeapi.endpoint.game.PokedexEndpoint;
import com.triceracode.pokeapi.endpoint.game.VersionEndpoint;
import com.triceracode.pokeapi.endpoint.game.VersionGroupEndpoint;
import com.triceracode.pokeapi.endpoint.item.ItemAttributeEndpoint;
import com.triceracode.pokeapi.endpoint.item.ItemCategoryEndpoint;
import com.triceracode.pokeapi.endpoint.item.ItemEndpoint;
import com.triceracode.pokeapi.endpoint.item.ItemPocketEndpoint;
import com.triceracode.pokeapi.endpoint.language.LanguageEndpoint;
import com.triceracode.pokeapi.endpoint.pokemon.PokemonEndpoint;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Objects;

public class PokeAPIServiceImp implements PokeAPIService {

    private final Retrofit retrofit;

    public PokeAPIServiceImp() {
        String urlBase = Objects.requireNonNullElse(System.getenv("POKE_API_URL"), "https://pokeapi.co/api/v2/");
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        this.retrofit = new Retrofit.Builder()
                .baseUrl(urlBase)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    @Override
    public PokemonEndpoint pokemon() {
        return retrofit.create(PokemonEndpoint.class);
    }

    @Override
    public AbilityEndpoint ability() {
        return retrofit.create(AbilityEndpoint.class);
    }

    @Override
    public BerryEndpoint berry() {
        return retrofit.create(BerryEndpoint.class);
    }

    @Override
    public BerryFirmnessEndpoint berryFirmness() {
        return retrofit.create(BerryFirmnessEndpoint.class);
    }

    @Override
    public BerryFlavorEndpoint berryFlavor() {
        return retrofit.create(BerryFlavorEndpoint.class);
    }

    @Override
    public ContestTypeEndpoint contestType() {
        return retrofit.create(ContestTypeEndpoint.class);
    }

    @Override
    public ContestEffectEndpoint contestEffect() {
        return retrofit.create(ContestEffectEndpoint.class);
    }

    @Override
    public SuperContestEffectEndpoint superContestEffect() {
        return retrofit.create(SuperContestEffectEndpoint.class);
    }

    @Override
    public LanguageEndpoint language() {
        return retrofit.create(LanguageEndpoint.class);
    }

    @Override
    public EncounterMethodEndpoint encounterMethod() {
        return retrofit.create(EncounterMethodEndpoint.class);
    }

    @Override
    public EncounterConditionEndpoint encounterCondition() {
        return retrofit.create(EncounterConditionEndpoint.class);
    }

    @Override
    public EncounterConditionValueEndpoint encounterConditionValue() {
        return retrofit.create(EncounterConditionValueEndpoint.class);
    }

    @Override
    public EvolutionChainEndpoint evolutionChain() {
        return retrofit.create(EvolutionChainEndpoint.class);
    }

    @Override
    public EvolutionTriggerEndpoint evolutionTrigger() {
        return retrofit.create(EvolutionTriggerEndpoint.class);
    }

    @Override
    public GenerationEndpoint generation() {
        return retrofit.create(GenerationEndpoint.class);
    }

    @Override
    public PokedexEndpoint pokedex() {
        return retrofit.create(PokedexEndpoint.class);
    }

    @Override
    public VersionEndpoint version() {
        return retrofit.create(VersionEndpoint.class);
    }

    @Override
    public VersionGroupEndpoint versionGroup() {
        return retrofit.create(VersionGroupEndpoint.class);
    }

    @Override
    public ItemEndpoint item() {
        return retrofit.create(ItemEndpoint.class);
    }

    @Override
    public ItemAttributeEndpoint itemAttribute() {
        return retrofit.create(ItemAttributeEndpoint.class);
    }

    @Override
    public ItemCategoryEndpoint itemCategory() {
        return retrofit.create(ItemCategoryEndpoint.class);
    }

    @Override
    public ItemPocketEndpoint itemPocket() {
        return retrofit.create(ItemPocketEndpoint.class);
    }

}
