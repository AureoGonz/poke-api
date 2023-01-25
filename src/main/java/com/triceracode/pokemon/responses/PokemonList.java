package com.triceracode.pokemon.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PokemonList {

    private Long count;
    private String next;
    private String previous;
    private List<PokemonListItem> results;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PokemonListItem {

        private String name;
        private String url;

    }

}
