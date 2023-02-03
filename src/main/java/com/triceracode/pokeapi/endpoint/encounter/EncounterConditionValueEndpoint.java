package com.triceracode.pokeapi.endpoint.encounter;

import com.triceracode.pokeapi.model.ResourceBatch;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EncounterConditionValueEndpoint {

    @GET("encounter-condition-value/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("encounter-condition-value/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("encounter-condition-value/{id}")
    Call<ResponseBody> byId(@Path("id") Long id);

    @GET("encounter-condition-value/{name}")
    Call<ResponseBody> byName(@Path("name") String name);

}
