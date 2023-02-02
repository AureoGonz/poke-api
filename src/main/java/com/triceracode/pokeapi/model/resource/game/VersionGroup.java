package com.triceracode.pokeapi.model.resource.game;

import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class VersionGroup extends Endpointable {

    private Long id;
    private String name;
    private Integer order;
    private NamedAPIResource generation;
    private List<NamedAPIResource> moveLearnMethods;
    private List<NamedAPIResource> pokedexes;
    private List<NamedAPIResource> regions;
    private List<NamedAPIResource> versions;

}
