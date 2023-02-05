package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.pokemon.PokemonColor;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonColorEndpoint {

    @GET("pokemon-color/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokemon-color/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("pokemon-color/{id}")
    Call<PokemonColor> byId(@Path("id") Long id);

    @GET("pokemon-color/{name}")
    Call<PokemonColor> byName(@Path("name") String name);

}
