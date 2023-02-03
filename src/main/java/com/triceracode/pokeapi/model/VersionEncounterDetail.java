package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class VersionEncounterDetail {

    private NamedAPIResource version;
    private Integer maxChance;
    private List<Encounter> encounterDetails;

}
