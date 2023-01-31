package com.triceracode.pokeapi.model.resource.contest;

import com.triceracode.pokeapi.model.Effect;
import com.triceracode.pokeapi.model.FlavorText;
import lombok.*;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class ContestEffect {

    private Long id;
    private Integer appeal;
    private Integer jam;
    private List<Effect> effectEntries;
    private List<FlavorText> flavorTextEntries;

}
