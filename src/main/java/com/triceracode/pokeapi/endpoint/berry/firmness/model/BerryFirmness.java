package com.triceracode.pokeapi.endpoint.berry.firmness.model;

import com.triceracode.pokeapi.model.Name;
import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BerryFirmness {

    private Long id;
    private String name;
    private List<NamedAPIResource> berries;
    private List<Name> names;

}
