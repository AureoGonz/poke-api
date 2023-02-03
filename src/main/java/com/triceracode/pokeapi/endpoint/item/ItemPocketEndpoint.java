package com.triceracode.pokeapi.endpoint.item;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.item.ItemPocket;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ItemPocketEndpoint {

    @GET("item-pocket")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("item-pocket")
    Call<ResourceBatch> list();

    @GET("item-pocket/{id}")
    Call<ItemPocket> byId(@Path("id") Long id);

    @GET("item-pocket/{name}")
    Call<ItemPocket> byName(@Path("name") String name);

}
