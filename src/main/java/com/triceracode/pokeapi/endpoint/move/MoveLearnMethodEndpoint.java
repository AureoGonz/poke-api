package com.triceracode.pokeapi.endpoint.move;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.move.MoveLearnMethod;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MoveLearnMethodEndpoint {

    @GET("move-learn-method/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("move-learn-method/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("move-learn-method/{id}")
    Call<MoveLearnMethod> byId(@Path("id") Long id);

    @GET("move-learn-method/{name}")
    Call<MoveLearnMethod> byName(@Path("name") String name);

}
