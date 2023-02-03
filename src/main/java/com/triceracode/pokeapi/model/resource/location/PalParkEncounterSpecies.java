package com.triceracode.pokeapi.model.resource.location;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class PalParkEncounterSpecies {

    private Integer baseScore;
    private Integer rate;
    private NamedAPIResource pokemonSpecies;

}
