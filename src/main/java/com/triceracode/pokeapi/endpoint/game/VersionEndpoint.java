package com.triceracode.pokeapi.endpoint.game;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.game.Version;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface VersionEndpoint {

    @GET("version")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("version")
    Call<ResourceBatch> list();

    @GET("version/{id}")
    Call<Version> byId(@Path("id") Long id);

    @GET("version/{name}")
    Call<Version> byName(@Path("name") String name);

}
