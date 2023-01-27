package com.triceracode.pokeapi.enpoint.berry.flavor;

import com.triceracode.pokeapi.commonModels.ResourceBatch;
import com.triceracode.pokeapi.enpoint.berry.flavor.response.BerryFlavor;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BerryFlavorEndpoint {

    @GET("berry-flavor")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("berry-flavor")
    Call<ResourceBatch> list();

    @GET("berry-flavor/{id}")
    Call<BerryFlavor> byId(@Path("id") Long id);

    @GET("berry-flavor/{name}")
    Call<BerryFlavor> byName(@Path("name") String name);

}
