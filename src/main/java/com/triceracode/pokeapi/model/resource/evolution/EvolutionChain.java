package com.triceracode.pokeapi.model.resource.evolution;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class EvolutionChain {

    private Long id;
    private NamedAPIResource babyTriggerItem;
    private ChainLink chain;

}
