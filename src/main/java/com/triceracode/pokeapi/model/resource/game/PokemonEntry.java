package com.triceracode.pokeapi.model.resource.game;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class PokemonEntry {

    private Integer entryNumber;
    private NamedAPIResource pokemonSpecies;

}
