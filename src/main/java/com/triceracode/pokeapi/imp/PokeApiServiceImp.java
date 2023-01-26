package com.triceracode.pokeapi.imp;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.triceracode.pokeapi.PokeApiService;
import com.triceracode.pokeapi.enpoint.pokemon.EndpointPokemon;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokeApiServiceImp implements PokeApiService {

    private final Retrofit retrofit;

    public PokeApiServiceImp() {
        String urlBase = System.getenv("POKE_API_URLBASE");
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        this.retrofit = new Retrofit.Builder()
                .baseUrl(urlBase)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    @Override
    public EndpointPokemon pokemon() {
        return retrofit.create(EndpointPokemon.class);
    }
}
