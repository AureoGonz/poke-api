package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.pokemon.PokemonForm;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonFormEndpoint {

    @GET("pokemon-form/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokemon-form/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("pokemon-form/{id}")
    Call<PokemonForm> byId(@Path("id") Long id);

    @GET("pokemon-form/{name}")
    Call<PokemonForm> byName(@Path("name") String name);

}
