package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VersionGroupFlavorText {

    private String text;
    private NamedAPIResource language;
    private NamedAPIResource versionGroup;

}
