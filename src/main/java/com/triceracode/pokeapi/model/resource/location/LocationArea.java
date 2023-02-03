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
public class LocationArea extends Endpointable {

    private Long id;
    private String name;
    private Integer gameIndex;
    private List<EncounterMethodRate> encounterMethodRates;
    private NamedAPIResource location;
    private List<Name> names;
    private List<PokemonEncounter> pokemonEncounters;

}
