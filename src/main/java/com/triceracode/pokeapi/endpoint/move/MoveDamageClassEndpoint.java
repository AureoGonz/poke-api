package com.triceracode.pokeapi.endpoint.move;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.move.MoveDamageClass;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MoveDamageClassEndpoint {

    @GET("move-damage-class/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("move-damage-class/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("move-damage-class/{id}")
    Call<MoveDamageClass> byId(@Path("id") Long id);

    @GET("move-damage-class/{name}")
    Call<MoveDamageClass> byName(@Path("name") String name);

}
