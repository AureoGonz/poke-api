package com.triceracode.pokeapi.endpoint.move;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.move.MoveBattleStyle;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MoveBattleStyleEndpoint {

    @GET("move-battle-style/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("move-battle-style/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("move-battle-style/{id}")
    Call<MoveBattleStyle> byId(@Path("id") Long id);

    @GET("move-battle-style/{name}")
    Call<MoveBattleStyle> byName(@Path("name") String name);

}
