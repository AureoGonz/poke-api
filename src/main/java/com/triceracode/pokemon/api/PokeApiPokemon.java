package com.triceracode.pokemon.api;

import com.triceracode.pokemon.responses.PokemonList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface PokeApiPokemon {

    @GET("pokemon")
    Call<PokemonList> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokemon")
    Call<PokemonList> list();

}
