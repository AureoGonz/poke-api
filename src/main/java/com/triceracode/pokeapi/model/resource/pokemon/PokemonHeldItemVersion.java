package com.triceracode.pokeapi.model.resource.pokemon;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class PokemonHeldItemVersion {

    private NamedAPIResource version;
    private Integer rarity;

}
