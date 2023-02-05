package com.triceracode.pokeapi.model.resource.pokemon;

import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.VersionGameIndex;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Pokemon extends Endpointable {

    private Long id;
    private String name;
    private Integer baseExperience;
    private Integer height;
    private Boolean isDefault;
    private Integer order;
    private Integer weight;
    private List<PokemonAbility> abilities;
    private List<NamedAPIResource> forms;
    private List<VersionGameIndex> gameIndices;
    private List<PokemonHeldItem> heldItems;
    private String locationAreaEncounters;
    private List<PokemonMove> moves;
    private List<PokemonTypePast> pastTypes;
    private PokemonSprites sprites;
    private NamedAPIResource species;
    private List<PokemonStat> stats;
    private List<PokemonType> types;

}
