package com.triceracode.pokeapi.endpoint.contest.effect;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.endpoint.contest.effect.model.ContestEffect;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ContestEffectEndpoint {

    @GET("contest-effect")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("contest-effect")
    Call<ResourceBatch> list();

    @GET("contest-effect/{id}")
    Call<ContestEffect> byId(@Path("id") Long id);

    @GET("contest-effect/{name}")
    Call<ContestEffect> byName(@Path("name") String name);

}
