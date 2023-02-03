package com.triceracode.pokeapi.model.resource.location;

import com.triceracode.pokeapi.model.Name;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class PalParkArea extends Endpointable {

    private Long id;
    private String name;
    private List<Name> names;
    private List<PalParkEncounterSpecies> pokemonEncounters;

}
