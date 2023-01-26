package com.triceracode.pokeapi.enpoint.pokemon;

import com.triceracode.pokeapi.commonModels.ResourceBatch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface EndpointPokemon {

    @GET("pokemon")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokemon")
    Call<ResourceBatch> list();

}