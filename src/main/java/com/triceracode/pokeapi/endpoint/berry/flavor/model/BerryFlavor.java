package com.triceracode.pokeapi.endpoint.berry.flavor.model;

import com.triceracode.pokeapi.model.Name;
import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BerryFlavor {

    private Long id;
    private String name;
    private List<FlavorBerryMap> berries;
    private NamedAPIResource contestType;
    private List<Name> names;

}
