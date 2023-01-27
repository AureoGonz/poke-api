package com.triceracode.pokeapi.endpoint.ability.model;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbilityPokemon {

    private Boolean isHidden;
    private Integer slot;
    private NamedAPIResource pokemon;

}
