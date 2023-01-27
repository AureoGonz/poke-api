package com.triceracode.pokeapi.enpoint.contest.supereffect.response;

import com.triceracode.pokeapi.commonModels.FlavorText;
import com.triceracode.pokeapi.commonModels.NamedAPIResource;
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
