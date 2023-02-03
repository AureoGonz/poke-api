package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Encounter {

    private Integer minLevel;
    private Integer maxLevel;
    private List<NamedAPIResource> conditionValues;
    private Integer chance;
    private NamedAPIResource method;

}
