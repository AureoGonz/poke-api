package com.triceracode.pokeapi.model.resource.evolution;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class EvolutionDetail {

    private NamedAPIResource item;
    private NamedAPIResource trigger;
    private Integer gender;
    private NamedAPIResource heldItem;
    private NamedAPIResource knownMove;
    private NamedAPIResource knowMoveType;
    private NamedAPIResource location;
    private Integer minLevel;
    private Integer minHappiness;
    private Integer minBeauty;
    private Integer minAffection;
    private Boolean needsOverworldRain;
    private NamedAPIResource partySpecies;
    private NamedAPIResource partyType;
    private Integer relativePhysicalStats;
    private NamedAPIResource tradeSpecies;
    private Boolean turnUpsideDown;

}
