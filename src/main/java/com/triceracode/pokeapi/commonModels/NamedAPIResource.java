package com.triceracode.pokeapi.commonModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NamedAPIResource {

    private String name;
    private String url;

}
