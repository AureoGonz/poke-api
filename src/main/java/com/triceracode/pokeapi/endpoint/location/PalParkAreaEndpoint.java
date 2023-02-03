package com.triceracode.pokeapi.endpoint.location;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.location.PalParkArea;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PalParkAreaEndpoint {

    @GET("pal-park-area/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pal-park-area/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("pal-park-area/{id}")
    Call<PalParkArea> byId(@Path("id") Long id);

    @GET("pal-park-area/{name}")
    Call<PalParkArea> byName(@Path("name") String name);

}
