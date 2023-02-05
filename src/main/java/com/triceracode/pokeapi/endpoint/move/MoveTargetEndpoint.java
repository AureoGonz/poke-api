package com.triceracode.pokeapi.endpoint.move;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.move.MoveTarget;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MoveTargetEndpoint {

    @GET("move-target/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("move-target/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("move-target/{id}")
    Call<MoveTarget> byId(@Path("id") Long id);

    @GET("move-target/{name}")
    Call<MoveTarget> byName(@Path("name") String name);

}
