package com.triceracode.pokeapi.model.resource.pokemon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class NaturePokeathlonStatAffectSets {

    private List<NaturePokeathlonStatAffect> increase;
    private List<NaturePokeathlonStatAffect> decrease;

}
