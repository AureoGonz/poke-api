package com.triceracode.pokeapi.model.resource.berry;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class FlavorBerryMap {

    private Integer potency;
    private NamedAPIResource berry;

}
