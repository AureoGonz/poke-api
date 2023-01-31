package com.triceracode.pokeapi.model.resource.ability;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class AbilityPokemon {

    private Boolean isHidden;
    private Integer slot;
    private NamedAPIResource pokemon;

}
