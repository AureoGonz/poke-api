package com.triceracode.pokeapi.enpoint.berry.flavor.response;

import com.triceracode.pokeapi.commonModels.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlavorBerryMap {

    private Integer potency;
    private NamedAPIResource berry;

}
