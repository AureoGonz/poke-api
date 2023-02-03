package com.triceracode.pokeapi.endpoint.item;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.item.Item;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ItemEndpoint {

    @GET("item/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("item/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("item/{id}")
    Call<Item> byId(@Path("id") Long id);

    @GET("item/{name}")
    Call<Item> byName(@Path("name") String name);

}
