package com.triceracode.pokeapi.model.resource.item;

import com.triceracode.pokeapi.model.*;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Item extends Endpointable {

    private Long id;
    private String name;
    private Integer cost;
    private Integer flingPower;
    private NamedAPIResource flingEffect;
    private List<NamedAPIResource> attributes;
    private NamedAPIResource category;
    private List<VerboseEffect> effectEntries;
    private List<VersionGroupFlavorText> flavorTextEntries;
    private List<GenerationGameIndex> gameIndices;
    private List<Name> names;
    private ItemSprites sprites;
    private List<ItemHolderPokemon> heldByPokemon;
    private APIResource babyTriggerFor;
    private List<MachineVersionDetail> machines;

}
