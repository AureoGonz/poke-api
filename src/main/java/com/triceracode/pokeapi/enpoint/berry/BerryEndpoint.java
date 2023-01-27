package com.triceracode.pokeapi.enpoint.berry;

import com.triceracode.pokeapi.commonModels.ResourceBatch;
import com.triceracode.pokeapi.enpoint.berry.response.Berry;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BerryEndpoint {

    @GET("berry")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("berry")
    Call<ResourceBatch> list();

    @GET("berry/{id}")
    Call<Berry> byId(@Path("id") Long id);

    @GET("berry/{name}")
    Call<Berry> byName(@Path("name") String name);

}
