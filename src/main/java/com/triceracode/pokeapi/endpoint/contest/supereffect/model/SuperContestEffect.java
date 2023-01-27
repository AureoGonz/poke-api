package com.triceracode.pokeapi.endpoint.contest.supereffect.model;

import com.triceracode.pokeapi.model.FlavorText;
import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperContestEffect {

    private Long id;
    private Integer appeal;
    private List<FlavorText> flavorTextEntries;
    private List<NamedAPIResource> moves;

}
