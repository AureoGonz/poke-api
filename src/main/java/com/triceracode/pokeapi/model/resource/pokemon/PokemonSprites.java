package com.triceracode.pokeapi.model.resource.pokemon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class PokemonSprites {

    private String frontDefault;
    private String frontShiny;
    private String frontFemale;
    private String frontShinyFemale;
    private String backDefault;
    private String backShiny;
    private String backFemale;
    private String backShinyFemale;

}
