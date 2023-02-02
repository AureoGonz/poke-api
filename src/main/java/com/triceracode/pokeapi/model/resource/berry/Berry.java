package com.triceracode.pokeapi.model.resource.berry;

import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Berry extends Endpointable {

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
