package com.triceracode.pokeapi.endpoint.contest;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.contest.ContestType;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ContestTypeEndpoint {

    @GET("contest-type/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("contest-type/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("contest-type/{id}")
    Call<ContestType> byId(@Path("id") Long id);

    @GET("contest-type/{name}")
    Call<ContestType> byName(@Path("name") String name);

}
