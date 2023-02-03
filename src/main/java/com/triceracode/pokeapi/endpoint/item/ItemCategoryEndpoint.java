package com.triceracode.pokeapi.endpoint.item;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.item.ItemCategory;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ItemCategoryEndpoint {

    @GET("item-category")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("item-category")
    Call<ResourceBatch> list();

    @GET("item-category/{id}")
    Call<ItemCategory> byId(@Path("id") Long id);

    @GET("item-category/{name}")
    Call<ItemCategory> byName(@Path("name") String name);

}
