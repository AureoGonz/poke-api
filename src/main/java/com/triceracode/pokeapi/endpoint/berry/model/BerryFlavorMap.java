package com.triceracode.pokeapi.endpoint.berry.model;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BerryFlavorMap {

    private Integer potency;
    private NamedAPIResource flavor;

}
