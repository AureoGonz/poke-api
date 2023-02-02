package com.triceracode.pokeapi.endpoint.game;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.game.VersionGroup;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface VersionGroupEndpoint {

    @GET("version-group")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("version-group")
    Call<ResourceBatch> list();

    @GET("version-group/{id}")
    Call<VersionGroup> byId(@Path("id") Long id);

    @GET("version-group/{name}")
    Call<VersionGroup> byName(@Path("name") String name);

}
