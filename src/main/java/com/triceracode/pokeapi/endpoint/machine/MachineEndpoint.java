package com.triceracode.pokeapi.endpoint.machine;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.machine.Machine;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MachineEndpoint {

    @GET("machine/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("machine/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("machine/{id}")
    Call<Machine> byId(@Path("id") Long id);

    @GET("machine/{name}")
    Call<Machine> byName(@Path("name") String name);

}
