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

}
