package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.pokemon.PokeathlonStat;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokeathlonStatEndpoint {

    @GET("pokeathlon-stat/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokeathlon-stat/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("pokeathlon-stat/{id}")
    Call<PokeathlonStat> byId(@Path("id") Long id);

    @GET("pokeathlon-stat/{name}")
    Call<PokeathlonStat> byName(@Path("name") String name);

}
