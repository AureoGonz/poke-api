package com.triceracode.pokeapi.endpoint.game;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.game.Pokedex;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokedexEndpoint {

    @GET("pokedex")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokedex")
    Call<ResourceBatch> list();

    @GET("pokedex/{id}")
    Call<Pokedex> byId(@Path("id") Long id);

    @GET("pokedex/{name}")
    Call<Pokedex> byName(@Path("name") String name);

}
