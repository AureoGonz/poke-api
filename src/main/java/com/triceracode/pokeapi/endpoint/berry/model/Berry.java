package com.triceracode.pokeapi.endpoint.berry.model;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Berry {

    private Long id;
    private String name;
    private Integer growthTime;
    private Integer maxHarvest;
    private Integer naturalGiftPower;
    private Integer size;
    private Integer smoothness;
    private Integer soilDryness;
    private NamedAPIResource firmness;
    private List<BerryFlavorMap> flavors;
    private NamedAPIResource item;
    private NamedAPIResource naturalGiftType;

}
