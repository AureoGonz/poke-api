package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.pokemon.GrowthRate;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GrowthRateEndpoint {

    @GET("growth-rate/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("growth-rate/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("growth-rate/{id}")
    Call<GrowthRate> byId(@Path("id") Long id);

    @GET("growth-rate/{name}")
    Call<GrowthRate> byName(@Path("name") String name);

}
