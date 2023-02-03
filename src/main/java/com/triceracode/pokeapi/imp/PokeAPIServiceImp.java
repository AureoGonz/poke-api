package com.triceracode.pokeapi.imp;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.triceracode.pokeapi.PokeAPIConfig;
import com.triceracode.pokeapi.PokeAPIService;
import com.triceracode.pokeapi.endpoint.berry.*;
import com.triceracode.pokeapi.endpoint.contest.*;
import com.triceracode.pokeapi.endpoint.encounter.*;
import com.triceracode.pokeapi.endpoint.evolution.*;
import com.triceracode.pokeapi.endpoint.game.*;
import com.triceracode.pokeapi.endpoint.item.*;
import com.triceracode.pokeapi.endpoint.language.*;
import com.triceracode.pokeapi.endpoint.pokemon.*;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.File;
import java.util.*;

public class PokeAPIServiceImp implements PokeAPIService {

    private final Retrofit retrofit;
    private final PokemonEndpoint pokemonEndpoint;
    private final AbilityEndpoint abilityEndpoint;
    private final BerryEndpoint berryEndpoint;
    private final BerryFirmnessEndpoint berryFirmnessEndpoint;
    private final BerryFlavorEndpoint berryFlavorEndpoint;
    private final ContestTypeEndpoint contestTypeEndpoint;
    private final ContestEffectEndpoint contestEffectEndpoint;
    private final SuperContestEffectEndpoint superContestEffectEndpoint;
    private final LanguageEndpoint languageEndpoint;
    private final EncounterMethodEndpoint encounterMethodEndpoint;
    private final EncounterConditionEndpoint encounterConditionEndpoint;
    private final EncounterConditionValueEndpoint encounterConditionValueEndpoint;
    private final EvolutionChainEndpoint evolutionChainEndpoint;
    private final EvolutionTriggerEndpoint evolutionTriggerEndpoint;
    private final GenerationEndpoint generationEndpoint;
    private final PokedexEndpoint pokedexEndpoint;
    private final VersionEndpoint versionEndpoint;
    private final VersionGroupEndpoint versionGroupEndpoint;
    private final ItemEndpoint itemEndpoint;
    private final ItemAttributeEndpoint itemAttributeEndpoint;
    private final ItemCategoryEndpoint itemCategoryEndpoint;
    private final ItemPocketEndpoint itemPocketEndpoint;

    public PokeAPIServiceImp(PokeAPIConfig config) {
        String urlBase = Objects.requireNonNull(config.urlBase);
        Cache cache = null;
        if(config.cacheSize != null) {
            File cacheDir = new File(config.cacheDir);
            int cacheSize = config.cacheSize > 0 ? config.cacheSize : 10;
            if(!cacheDir.exists()) cacheDir.mkdir();
            cache = new Cache(cacheDir, cacheSize * 1024 * 1024);
        }
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .cache(cache).build();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        this.retrofit = new Retrofit.Builder()
                .baseUrl(urlBase)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        this.pokemonEndpoint = this.retrofit.create(PokemonEndpoint.class);
        this.abilityEndpoint = this.retrofit.create(AbilityEndpoint.class);
        this.berryEndpoint = this.retrofit.create(BerryEndpoint.class);
        this.berryFirmnessEndpoint = this.retrofit.create(BerryFirmnessEndpoint.class);
        this.berryFlavorEndpoint = this.retrofit.create(BerryFlavorEndpoint.class);
        this.contestTypeEndpoint = this.retrofit.create(ContestTypeEndpoint.class);
        this.contestEffectEndpoint = this.retrofit.create(ContestEffectEndpoint.class);
        this.superContestEffectEndpoint = this.retrofit.create(SuperContestEffectEndpoint.class);
        this.languageEndpoint = this.retrofit.create(LanguageEndpoint.class);
        this.encounterMethodEndpoint = this.retrofit.create(EncounterMethodEndpoint.class);
        this.encounterConditionEndpoint = this.retrofit.create(EncounterConditionEndpoint.class);
        this.encounterConditionValueEndpoint = this.retrofit.create(EncounterConditionValueEndpoint.class);
        this.evolutionChainEndpoint = this.retrofit.create(EvolutionChainEndpoint.class);
        this.evolutionTriggerEndpoint = this.retrofit.create(EvolutionTriggerEndpoint.class);
        this.generationEndpoint = this.retrofit.create(GenerationEndpoint.class);
        this.pokedexEndpoint = this.retrofit.create(PokedexEndpoint.class);
        this.versionEndpoint = this.retrofit.create(VersionEndpoint.class);
        this.versionGroupEndpoint = this.retrofit.create(VersionGroupEndpoint.class);
        this.itemEndpoint = this.retrofit.create(ItemEndpoint.class);
        this.itemAttributeEndpoint = this.retrofit.create(ItemAttributeEndpoint.class);
        this.itemCategoryEndpoint = this.retrofit.create(ItemCategoryEndpoint.class);
        this.itemPocketEndpoint = this.retrofit.create(ItemPocketEndpoint.class);
    }

    public PokeAPIServiceImp() {
        this(new PokeAPIConfig());
    }

    @Override
    public PokemonEndpoint pokemon() {
        return this.pokemonEndpoint;
    }

    @Override
    public AbilityEndpoint ability() {
        return this.abilityEndpoint;
    }

    @Override
    public BerryEndpoint berry() {
        return this.berryEndpoint;
    }

    @Override
    public BerryFirmnessEndpoint berryFirmness() {
        return this.berryFirmnessEndpoint;
    }

    @Override
    public BerryFlavorEndpoint berryFlavor() {
        return this.berryFlavorEndpoint;
    }

    @Override
    public ContestTypeEndpoint contestType() {
        return this.contestTypeEndpoint;
    }

    @Override
    public ContestEffectEndpoint contestEffect() {
        return this.contestEffectEndpoint;
    }

    @Override
    public SuperContestEffectEndpoint superContestEffect() {
        return this.superContestEffectEndpoint;
    }

    @Override
    public LanguageEndpoint language() {
        return this.languageEndpoint;
    }

    @Override
    public EncounterMethodEndpoint encounterMethod() {
        return this.encounterMethodEndpoint;
    }

    @Override
    public EncounterConditionEndpoint encounterCondition() {
        return this.encounterConditionEndpoint;
    }

    @Override
    public EncounterConditionValueEndpoint encounterConditionValue() {
        return this.encounterConditionValueEndpoint;
    }

    @Override
    public EvolutionChainEndpoint evolutionChain() {
        return this.evolutionChainEndpoint;
    }

    @Override
    public EvolutionTriggerEndpoint evolutionTrigger() {
        return this.evolutionTriggerEndpoint;
    }

    @Override
    public GenerationEndpoint generation() {
        return this.generationEndpoint;
    }

    @Override
    public PokedexEndpoint pokedex() {
        return this.pokedexEndpoint;
    }

    @Override
    public VersionEndpoint version() {
        return this.versionEndpoint;
    }

    @Override
    public VersionGroupEndpoint versionGroup() {
        return this.versionGroupEndpoint;
    }

    @Override
    public ItemEndpoint item() {
        return this.itemEndpoint;
    }

    @Override
    public ItemAttributeEndpoint itemAttribute() {
        return this.itemAttributeEndpoint;
    }

    @Override
    public ItemCategoryEndpoint itemCategory() {
        return this.itemCategoryEndpoint;
    }

    @Override
    public ItemPocketEndpoint itemPocket() {
        return this.itemPocketEndpoint;
    }

}
