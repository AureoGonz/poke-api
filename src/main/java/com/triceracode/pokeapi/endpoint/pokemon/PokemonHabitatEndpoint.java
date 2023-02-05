package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.pokemon.PokemonHabitat;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonHabitatEndpoint {

    @GET("pokemon-habitat/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokemon-habitat/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("pokemon-habitat/{id}")
    Call<PokemonHabitat> byId(@Path("id") Long id);

    @GET("pokemon-habitat/{name}")
    Call<PokemonHabitat> byName(@Path("name") String name);

}
