package com.triceracode.pokeapi.endpoint.location;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.location.Location;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LocationEndpoint {

    @GET("location/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("location/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("location/{id}")
    Call<Location> byId(@Path("id") Long id);

    @GET("location/{name}")
    Call<Location> byName(@Path("name") String name);

}
