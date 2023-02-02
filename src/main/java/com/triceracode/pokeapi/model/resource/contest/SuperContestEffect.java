package com.triceracode.pokeapi.model.resource.contest;

import com.triceracode.pokeapi.model.FlavorText;
import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class SuperContestEffect {

    private Long id;
    private Integer appeal;
    private List<FlavorText> flavorTextEntries;
    private List<NamedAPIResource> moves;

}