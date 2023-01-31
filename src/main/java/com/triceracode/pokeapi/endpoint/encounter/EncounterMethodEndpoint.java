package com.triceracode.pokeapi.endpoint.encounter;

import com.triceracode.pokeapi.model.ResourceBatch;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EncounterMethodEndpoint {

    @GET("encounter-method/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("encounter-method/")
    Call<ResourceBatch> list();

    @GET("encounter-method/{id}")
    Call<ResponseBody> byId(@Path("id") Long id);

    @GET("encounter-method/{name}")
    Call<ResponseBody> byName(@Path("name") String name);

}
