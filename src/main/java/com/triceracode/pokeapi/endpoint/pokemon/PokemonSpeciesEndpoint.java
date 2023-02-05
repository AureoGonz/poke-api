package com.triceracode.pokeapi.endpoint.pokemon;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.pokemon.PokemonSpecies;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonSpeciesEndpoint {

    @GET("pokemon-species/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("pokemon-species/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("pokemon-species/{id}")
    Call<PokemonSpecies> byId(@Path("id") Long id);

    @GET("pokemon-species/{name}")
    Call<PokemonSpecies> byName(@Path("name") String name);

}
