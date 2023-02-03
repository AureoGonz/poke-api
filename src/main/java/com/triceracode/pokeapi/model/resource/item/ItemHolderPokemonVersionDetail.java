package com.triceracode.pokeapi.model.resource.item;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class ItemHolderPokemonVersionDetail {

    private Integer rarity;
    private NamedAPIResource version;

}
