package com.triceracode.pokeapi.commonModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Name {

    private String name;
    private NamedAPIResource language;

}
