package com.triceracode.pokeapi.enpoint.berry.firmness;

import com.triceracode.pokeapi.commonModels.ResourceBatch;
import com.triceracode.pokeapi.enpoint.berry.firmness.response.BerryFirmness;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BerryFirmnessEndpoint {

    @GET("berry-firmness")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("berry-firmness")
    Call<ResourceBatch> list();

    @GET("berry-firmness/{id}")
    Call<BerryFirmness> byId(@Path("id") Long id);

    @GET("berry-firmness/{name}")
    Call<BerryFirmness> byName(@Path("name") String name);

}
