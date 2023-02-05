package com.triceracode.pokeapi.model.resource.pokemon;

import com.triceracode.pokeapi.model.APIResource;
import com.triceracode.pokeapi.model.Name;
import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Stat extends Endpointable {

    private Long id;
    private String name;
    private Integer gameIndex;
    private Boolean isBattleOnly;
    private MoveStatAffectSets affectingMoves;
    private NatureStatAffectSets affectingNatures;
    private List<APIResource> characteristics;
    private NamedAPIResource moveDamageClass;
    private List<Name> names;

}
