package com.triceracode.pokemon.imp;

import com.triceracode.pokemon.PokeApiService;
import com.triceracode.pokemon.api.PokeApiPokemon;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokeApiServiceImp implements PokeApiService {

    private final Retrofit retrofit;

    public PokeApiServiceImp() {
        String urlBase = System.getenv("POKE_API_URLBASE");
        this.retrofit = new Retrofit.Builder()
                .baseUrl(urlBase)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Override
    public PokeApiPokemon pokemon() {
        return retrofit.create(PokeApiPokemon.class);
    }
}
