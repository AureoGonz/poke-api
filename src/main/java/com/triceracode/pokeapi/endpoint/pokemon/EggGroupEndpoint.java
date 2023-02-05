package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.pokemon.EggGroup;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EggGroupEndpoint {

    @GET("egg-group/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("egg-group/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("egg-group/{id}")
    Call<EggGroup> byId(@Path("id") Long id);

    @GET("egg-group/{name}")
    Call<EggGroup> byName(@Path("name") String name);

}
