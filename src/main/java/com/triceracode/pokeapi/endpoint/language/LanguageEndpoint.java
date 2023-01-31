package com.triceracode.pokeapi.endpoint.language;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.language.Language;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LanguageEndpoint {

    @GET("language")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("language")
    Call<ResourceBatch> list();

    @GET("language/{id}")
    Call<Language> byId(@Path("id") Long id);

    @GET("language/{name}")
    Call<Language> byName(@Path("name") String name);

}
