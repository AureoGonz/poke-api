package com.triceracode.pokeapi.enpoint.ability.response;

import com.triceracode.pokeapi.commonModels.NamedAPIResource;
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
