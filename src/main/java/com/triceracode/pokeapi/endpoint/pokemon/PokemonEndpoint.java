package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.ResourceBatch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface PokemonEndpoint {

    @GET("pokemon/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokemon/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

}
