package com.triceracode.pokeapi.enpoint.contest.effect.response;

import com.triceracode.pokeapi.commonModels.Effect;
import com.triceracode.pokeapi.commonModels.FlavorText;
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
