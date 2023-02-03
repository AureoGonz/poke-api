package com.triceracode.pokeapi.endpoint.game;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.game.Generation;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GenerationEndpoint {

    @GET("generation/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("generation/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("generation/{id}")
    Call<Generation> byId(@Path("id") Long id);

    @GET("generation/{name}")
    Call<Generation> byName(@Path("name") String name);

}
