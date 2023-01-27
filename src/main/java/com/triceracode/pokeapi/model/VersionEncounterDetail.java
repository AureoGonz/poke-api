package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VersionEncounterDetail {

    private NamedAPIResource version;
    private Integer maxChance;
    private List<Encounter> encounterDetails;

}
