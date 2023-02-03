package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class VerboseEffect {

    private String effect;
    private String shortEffect;
    private NamedAPIResource language;

}
