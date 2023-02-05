package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.pokemon.LocationAreaEncounter;
import com.triceracode.pokeapi.model.resource.pokemon.Pokemon;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface PokemonEndpoint {

    @GET("pokemon/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokemon/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("pokemon/{id}")
    Call<Pokemon> byId(@Path("id") Long id);

    @GET("pokemon/{name}")
    Call<Pokemon> byName(@Path("name") String name);

    @GET("pokemon/{id}/encounters")
    Call<LocationAreaEncounter> locationArea(@Path("id") Long id);

    @GET("pokemon/{name}/encounters")
    Call<LocationAreaEncounter> locationArea(@Path("name") String name);

}
