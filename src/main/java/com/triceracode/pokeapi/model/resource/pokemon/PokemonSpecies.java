package com.triceracode.pokeapi.model.resource.pokemon;

import com.triceracode.pokeapi.model.*;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class PokemonSpecies extends Endpointable {

    private Long id;
    private String name;
    private Integer order;
    private Integer genderRate;
    private Integer captureRate;
    private Integer baseHappiness;
    private Boolean isBaby;
    private Boolean isLegendary;
    private Boolean isMythical;
    private Integer hatchCounter;
    private Boolean hasGenderDifferences;
    private Boolean formsSwitchable;
    private NamedAPIResource growthRate;
    private List<PokemonSpeciesDexEntry> pokedexNumbers;
    private List<NamedAPIResource> eggGroup;
    private NamedAPIResource color;
    private NamedAPIResource shape;
    private NamedAPIResource evolvesFromSpecies;
    private APIResource evolutionChain;
    private NamedAPIResource habitat;
    private NamedAPIResource generation;
    private List<Name> names;
    private List<PalParkEncounterArea> palParkEncounters;
    private List<FlavorText> flavorTextEntries;
    private List<Description> formDescriptions;
    private List<Genus> genera;
    private List<PokemonSpeciesVariety> varieties;

}
