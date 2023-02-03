package com.triceracode.pokeapi.endpoint.location;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.location.LocationArea;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LocationAreaEndpoint {

    @GET("location-area/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("location-area/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("location-area/{id}")
    Call<LocationArea> byId(@Path("id") Long id);

    @GET("location-area/{name}")
    Call<LocationArea> byName(@Path("name") String name);

}
