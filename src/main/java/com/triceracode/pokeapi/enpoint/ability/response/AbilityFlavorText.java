package com.triceracode.pokeapi.enpoint.ability.response;

import com.triceracode.pokeapi.commonModels.NamedAPIResource;
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
