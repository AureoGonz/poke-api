package com.triceracode.pokeapi.enpoint.berry.response;

import com.triceracode.pokeapi.commonModels.NamedAPIResource;
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
