package com.triceracode.pokeapi.endpoint.contest.type;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.endpoint.contest.type.model.ContestType;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ContestTypeEndpoint {

    @GET("contest-type")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("contest-type")
    Call<ResourceBatch> list();

    @GET("contest-type/{id}")
    Call<ContestType> byId(@Path("id") Long id);

    @GET("contest-type/{name}")
    Call<ContestType> byName(@Path("name") String name);

}
