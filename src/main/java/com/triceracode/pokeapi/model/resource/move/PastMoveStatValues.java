package com.triceracode.pokeapi.model.resource.move;

import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.VerboseEffect;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class PastMoveStatValues {

    private Integer accuracy;
    private Integer effectChance;
    private Integer power;
    private Integer pp;
    private List<VerboseEffect> effectEntries;
    private NamedAPIResource type;
    private NamedAPIResource versionGroup;

}
