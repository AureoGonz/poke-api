package com.triceracode.pokeapi.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class VersionGroupFlavorText {

    private String text;
    private NamedAPIResource language;
    private NamedAPIResource versionGroup;

}
