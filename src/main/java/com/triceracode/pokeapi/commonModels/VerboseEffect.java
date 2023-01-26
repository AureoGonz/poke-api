package com.triceracode.pokeapi.commonModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerboseEffect {

    private String effect;
    private String shortEffect;
    private NamedAPIResource language;

}
