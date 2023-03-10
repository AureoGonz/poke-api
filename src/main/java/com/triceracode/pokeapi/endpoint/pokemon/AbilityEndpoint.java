package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.resource.pokemon.Ability;
import com.triceracode.pokeapi.model.ResourceBatch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AbilityEndpoint {

    @GET("ability/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("ability/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("ability/{id}")
    Call<Ability> byId(@Path("id") Long id);

    @GET("ability/{name}")
    Call<Ability> byName(@Path("name") String name);

}
