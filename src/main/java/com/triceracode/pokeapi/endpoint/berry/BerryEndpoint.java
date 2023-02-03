package com.triceracode.pokeapi.endpoint.berry;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.berry.Berry;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BerryEndpoint {

    @GET("berry/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("berry/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("berry/{id}")
    Call<Berry> byId(@Path("id") Long id);

    @GET("berry/{name}")
    Call<Berry> byName(@Path("name") String name);

}
