package com.triceracode.pokeapi.endpoint.evolution;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.evolution.EvolutionTrigger;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EvolutionTriggerEndpoint {

    @GET("evolution-trigger")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("evolution-trigger")
    Call<ResourceBatch> list();

    @GET("evolution-trigger/{id}")
    Call<EvolutionTrigger> byId(@Path("id") Long id);

    @GET("evolution-trigger/{name}")
    Call<EvolutionTrigger> byName(@Path("name") String name);

}
