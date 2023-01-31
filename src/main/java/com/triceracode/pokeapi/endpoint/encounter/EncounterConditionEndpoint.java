package com.triceracode.pokeapi.endpoint.encounter;

import com.triceracode.pokeapi.model.ResourceBatch;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EncounterConditionEndpoint {

    @GET("encounter-condition/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("encounter-condition/")
    Call<ResourceBatch> list();

    @GET("encounter-condition/{id}")
    Call<ResponseBody> byId(@Path("id") Long id);

    @GET("encounter-condition/{name}")
    Call<ResponseBody> byName(@Path("name") String name);

}
