package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.pokemon.Characteristic;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CharacteristicEndpoint {

    @GET("characteristic/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("characteristic/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("characteristic/{id}")
    Call<Characteristic> byId(@Path("id") Long id);

    @GET("characteristic/{name}")
    Call<Characteristic> byName(@Path("name") String name);

}
