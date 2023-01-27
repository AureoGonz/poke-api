package com.triceracode.pokeapi.endpoint.contest.effect.model;

import com.triceracode.pokeapi.model.Effect;
import com.triceracode.pokeapi.model.FlavorText;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContestEffect {

    private Long id;
    private Integer appeal;
    private Integer jam;
    private List<Effect> effectEntries;
    private List<FlavorText> flavorTextEntries;

}
