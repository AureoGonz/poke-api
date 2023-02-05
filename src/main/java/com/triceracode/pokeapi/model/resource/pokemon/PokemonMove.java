package com.triceracode.pokeapi.model.resource.pokemon;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class PokemonMove {

    private NamedAPIResource move;
    private List<PokemonMoveVersion> versionGroupDetails;

}
