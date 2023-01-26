package com.triceracode.pokeapi.commonModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Effect {

    private String effect;
    private NamedAPIResource language;

}
