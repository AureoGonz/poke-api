package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class FlavorText {

    private String flavorText;
    private NamedAPIResource language;
    private NamedAPIResource version;

}
