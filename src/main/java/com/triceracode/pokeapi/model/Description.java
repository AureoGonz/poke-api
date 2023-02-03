package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Description {

    private String description;
    private NamedAPIResource language;

}
