package com.triceracode;

import com.triceracode.pokemon.PokeApiService;
import com.triceracode.pokemon.imp.PokeApiServiceImp;
import com.triceracode.pokemon.responses.PokemonList;
import retrofit2.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PokeApiService service = new PokeApiServiceImp();
        try {
            Response<PokemonList> pokemonListResponse = service.pokemon()
                    .list().execute();
            System.out.println(pokemonListResponse.body());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}