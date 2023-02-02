package com.triceracode.pokeapi.model.resource.game;

import com.triceracode.pokeapi.model.Description;
import com.triceracode.pokeapi.model.Name;
import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.resource.Endpointable;

import java.util.List;

public class Pokedex extends Endpointable {

    private Long id;
    private String name;
    private Boolean isMainSeries;
    private List<Description> descriptions;
    private List<Name> names;
    private List<PokemonEntry> pokemonEntries;
    private NamedAPIResource region;
    private List<NamedAPIResource> versionGroups;

}
