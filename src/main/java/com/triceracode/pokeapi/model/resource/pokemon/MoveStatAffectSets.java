package com.triceracode.pokeapi.model.resource.pokemon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class MoveStatAffectSets {

    private List<MoveStatAffect> increase;
    private List<MoveStatAffect> decrease;

}
