package com.triceracode.pokeapi.endpoint;

import com.triceracode.pokeapi.model.ResourceBatch;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ResourceEndpoint {

    @GET(".")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("./?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("{id}")
    Call<ResponseBody> byId(@Path("id") Long id);

    @GET("{name}")
    Call<ResponseBody> byName(@Path("name") String name);

}
