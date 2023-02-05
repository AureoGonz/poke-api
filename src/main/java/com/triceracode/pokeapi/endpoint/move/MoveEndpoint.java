package com.triceracode.pokeapi.endpoint.move;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.move.Move;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MoveEndpoint {

    @GET("move/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("move/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("move/{id}")
    Call<Move> byId(@Path("id") Long id);

    @GET("move/{name}")
    Call<Move> byName(@Path("name") String name);

}
