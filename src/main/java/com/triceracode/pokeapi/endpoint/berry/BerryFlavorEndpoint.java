package com.triceracode.pokeapi.endpoint.berry;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.berry.BerryFlavor;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BerryFlavorEndpoint {

    @GET("berry-flavor/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("berry-flavor/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("berry-flavor/{id}")
    Call<BerryFlavor> byId(@Path("id") Long id);

    @GET("berry-flavor/{name}")
    Call<BerryFlavor> byName(@Path("name") String name);

}
