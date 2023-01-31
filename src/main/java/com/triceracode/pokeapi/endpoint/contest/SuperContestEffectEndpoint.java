package com.triceracode.pokeapi.endpoint.contest;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.contest.SuperContestEffect;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SuperContestEffectEndpoint {

    @GET("super-contest-effect")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("super-contest-effect")
    Call<ResourceBatch> list();

    @GET("super-contest-effect/{id}")
    Call<SuperContestEffect> byId(@Path("id") Long id);

    @GET("super-contest-effect/{name}")
    Call<SuperContestEffect> byName(@Path("name") String name);

}
