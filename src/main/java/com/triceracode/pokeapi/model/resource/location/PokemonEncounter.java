package com.triceracode.pokeapi.model.resource.location;

import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.VersionEncounterDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class PokemonEncounter {

    private NamedAPIResource pokemon;
    private List<VersionEncounterDetail> versionDetails;

}
