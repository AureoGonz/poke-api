package com.triceracode.pokeapi.endpoint.item;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.item.ItemAttribute;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ItemAttributeEndpoint {

    @GET("item-attribute")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("item-attribute")
    Call<ResourceBatch> list();

    @GET("item-attribute/{id}")
    Call<ItemAttribute> byId(@Path("id") Long id);

    @GET("item-attribute/{name}")
    Call<ItemAttribute> byName(@Path("name") String name);

}
