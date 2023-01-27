package com.triceracode.pokeapi.endpoint.ability.model;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbilityFlavorText {

    private String flavorText;
    private NamedAPIResource language;
    private NamedAPIResource versionGroup;

}
