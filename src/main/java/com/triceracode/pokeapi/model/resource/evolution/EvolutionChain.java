package com.triceracode.pokeapi.model.resource.evolution;

import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class EvolutionChain extends Endpointable {

    private Long id;
    private NamedAPIResource babyTriggerItem;
    private ChainLink chain;

}
