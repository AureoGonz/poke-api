package com.triceracode.pokeapi.model.resource.move;

import com.triceracode.pokeapi.model.*;
import com.triceracode.pokeapi.model.resource.Endpointable;
import com.triceracode.pokeapi.model.resource.ability.AbilityEffectChange;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Move extends Endpointable {

    private Long id;
    private String name;
    private Integer accuracy;
    private Integer effectChance;
    private Integer pp;
    private Integer priority;
    private Integer power;
    private ContestComboSets contestCombo;
    private NamedAPIResource contestType;
    private APIResource contestEffect;
    private NamedAPIResource damageClass;
    private List<VerboseEffect> effectEntries;
    private List<AbilityEffectChange> effectChange;
    private List<NamedAPIResource> learnedByPokemon;
    private List<MoveFlavorText> flavorTextEntries;
    private NamedAPIResource generation;
    private List<MachineVersionDetail> machines;
    private MoveMetaData meta;
    private List<Name> names;
    private List<PastMoveStatValues> pastValues;
    private List<MoveStatChange> statChanges;
    private APIResource superContestEffect;
    private NamedAPIResource target;
    private NamedAPIResource type;

}
