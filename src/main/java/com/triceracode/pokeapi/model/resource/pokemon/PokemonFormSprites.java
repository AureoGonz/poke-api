package com.triceracode.pokeapi.model.resource.pokemon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class PokemonFormSprites {

    private String frontDefault;
    private String frontShiny;
    private String backDefault;
    private String backShiny;

}
