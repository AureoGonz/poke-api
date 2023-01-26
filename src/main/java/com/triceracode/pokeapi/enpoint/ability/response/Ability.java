package com.triceracode.pokeapi.enpoint.ability.response;

import com.triceracode.pokeapi.commonModels.Effect;
import com.triceracode.pokeapi.commonModels.Name;
import com.triceracode.pokeapi.commonModels.NamedAPIResource;
import com.triceracode.pokeapi.commonModels.VerboseEffect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ability {

    private Long id;
    private String name;
    private boolean isMainSeries;
    private NamedAPIResource generation;
    private List<Name> names;
    private List<VerboseEffect> effectEntries;
    private List<AbilityEffectChange> effectChanges;
    private List<AbilityFlavorText> flavorTextEntries;
    private List<AbilityPokemon> pokemon;

}
