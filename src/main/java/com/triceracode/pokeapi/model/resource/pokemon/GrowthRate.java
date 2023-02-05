package com.triceracode.pokeapi.model.resource.pokemon;

import com.triceracode.pokeapi.model.Description;
import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class GrowthRate extends Endpointable {

    private Long id;
    private String name;
    private String formula;
    private List<Description> descriptions;
    private List<GrowthRateExperienceLevel> levels;
    private List<NamedAPIResource> pokemonSpecies;

}
