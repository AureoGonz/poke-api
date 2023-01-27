package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Encounter {

    private Integer minLevel;
    private Integer maxLevel;
    private List<NamedAPIResource> conditionValues;
    private Integer chance;
    private NamedAPIResource method;

}
