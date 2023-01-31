package com.triceracode.pokeapi.model.resource.berry;

import com.triceracode.pokeapi.model.Name;
import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class BerryFlavor {

    private Long id;
    private String name;
    private List<FlavorBerryMap> berries;
    private NamedAPIResource contestType;
    private List<Name> names;

}
