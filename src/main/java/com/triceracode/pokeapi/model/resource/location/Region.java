package com.triceracode.pokeapi.model.resource.location;

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
public class Region extends Endpointable {

    private Long id;
    private List<NamedAPIResource> locations;
    private String name;
    private List<Name> names;
    private NamedAPIResource mainGeneration;
    private List<NamedAPIResource> pokedexes;
    private List<NamedAPIResource> versionGroups;

}
