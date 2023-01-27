package com.triceracode.pokeapi.endpoint.ability.model;

import com.triceracode.pokeapi.model.Effect;
import com.triceracode.pokeapi.model.NamedAPIResource;
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
