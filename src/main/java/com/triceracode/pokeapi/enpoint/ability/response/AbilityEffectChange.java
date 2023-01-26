package com.triceracode.pokeapi.enpoint.ability.response;

import com.triceracode.pokeapi.commonModels.Effect;
import com.triceracode.pokeapi.commonModels.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbilityEffectChange {

    private List<Effect> effectEntries;
    private NamedAPIResource versionGroup;

}
