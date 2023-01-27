package com.triceracode.pokeapi.enpoint.berry.firmness.response;

import com.triceracode.pokeapi.commonModels.Name;
import com.triceracode.pokeapi.commonModels.NamedAPIResource;
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
