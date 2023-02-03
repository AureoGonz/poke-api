package com.triceracode.pokeapi.model.resource.item;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class ItemHolderPokemon {

    private NamedAPIResource pokemon;
    private List<ItemHolderPokemonVersionDetail> versionDetails;

}
