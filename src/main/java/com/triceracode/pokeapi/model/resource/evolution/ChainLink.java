package com.triceracode.pokeapi.model.resource.evolution;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class ChainLink {

    private Boolean isBaby;
    private NamedAPIResource species;
    private List<EvolutionDetail> evolutionDetails;
    private List<ChainLink> evolvesTo;

}
