package com.triceracode.pokeapi.endpoint.evolution;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.evolution.EvolutionChain;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EvolutionChainEndpoint {

    @GET("evolution-chain/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("evolution-chain/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("evolution-chain/{id}")
    Call<EvolutionChain> byId(@Path("id") Long id);

    @GET("evolution-chain/{name}")
    Call<EvolutionChain> byName(@Path("name") String name);

}
