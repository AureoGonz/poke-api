package com.triceracode.pokeapi.model.resource.pokemon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class GrowthRateExperienceLevel {

    private Integer level;
    private Integer experience;

}
