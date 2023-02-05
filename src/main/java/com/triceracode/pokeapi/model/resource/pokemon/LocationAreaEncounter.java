package com.triceracode.pokeapi.model.resource.pokemon;

import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.VersionEncounterDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class LocationAreaEncounter {

    private NamedAPIResource locationArea;
    private List<VersionEncounterDetail> versionDetails;

}
