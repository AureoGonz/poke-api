package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlavorText {

    private String flavorText;
    private NamedAPIResource language;
    private NamedAPIResource version;

}