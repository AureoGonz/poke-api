package com.triceracode.pokeapi.enpoint.ability;

import com.triceracode.pokeapi.enpoint.ability.response.Ability;
import com.triceracode.pokeapi.commonModels.ResourceBatch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EndpointAbility {

    @GET("ability")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("ability")
    Call<ResourceBatch> list();

    @GET("ability/{id}")
    Call<Ability> byId(@Path("id") Long id);

    @GET("ability/{name}")
    Call<Ability> byName(@Path("name") String name);
}
