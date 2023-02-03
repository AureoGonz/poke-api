package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class VersionGameIndex {

    private Integer gameIndex;
    private NamedAPIResource version;

}
