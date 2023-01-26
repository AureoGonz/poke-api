package com.triceracode.pokeapi.enpoint.pokemon;

import com.triceracode.pokeapi.enpoint.pokemon.response.Ability;
import com.triceracode.pokeapi.enpoint.pokemon.response.PokemonBatch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface EndpointPokemon {

    @GET("pokemon")
    Call<PokemonBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokemon")
    Call<PokemonBatch> list();

    @GET("ability/{id}")
    Call<Ability> ability(@Path("id") Long id);

    @GET("ability/{name}")
    Call<Ability> ability(@Path("name") String name);

}
