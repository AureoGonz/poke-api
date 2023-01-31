package com.triceracode.pokeapi.model.resource.ability;

import com.triceracode.pokeapi.model.Effect;
import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class AbilityEffectChange {

    private List<Effect> effectEntries;
    private NamedAPIResource versionGroup;

}
