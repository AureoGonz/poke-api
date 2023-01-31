package com.triceracode.pokeapi.model.resource.encounter;

import com.triceracode.pokeapi.model.Name;
import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class EncounterCondition {

    private Long id;
    private String name;
    private List<Name> names;
    private List<NamedAPIResource> values;

}
