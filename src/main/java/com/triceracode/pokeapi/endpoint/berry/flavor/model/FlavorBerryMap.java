package com.triceracode.pokeapi.endpoint.berry.flavor.model;

import com.triceracode.pokeapi.model.NamedAPIResource;
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
