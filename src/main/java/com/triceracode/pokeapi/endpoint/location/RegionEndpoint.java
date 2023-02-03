package com.triceracode.pokeapi.endpoint.location;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.location.Region;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RegionEndpoint {

    @GET("region/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("region/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("region/{id}")
    Call<Region> byId(@Path("id") Long id);

    @GET("region/{name}")
    Call<Region> byName(@Path("name") String name);

}
