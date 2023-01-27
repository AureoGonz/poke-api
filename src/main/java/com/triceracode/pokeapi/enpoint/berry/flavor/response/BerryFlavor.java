package com.triceracode.pokeapi.enpoint.berry.flavor.response;

import com.triceracode.pokeapi.commonModels.Name;
import com.triceracode.pokeapi.commonModels.NamedAPIResource;
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
