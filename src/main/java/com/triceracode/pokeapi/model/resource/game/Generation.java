package com.triceracode.pokeapi.model.resource.game;

import com.triceracode.pokeapi.model.Name;
import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Generation extends Endpointable {

    private Long id;
    private String name;
    private List<NamedAPIResource> abilities;
    private List<Name> names;
    private NamedAPIResource mainRegion;
    private List<NamedAPIResource> moves;
    private List<NamedAPIResource> pokemonSpecies;
    private List<NamedAPIResource> types;
    private List<NamedAPIResource> versionGroups;

}
