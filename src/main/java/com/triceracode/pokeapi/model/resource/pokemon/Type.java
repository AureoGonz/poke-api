package com.triceracode.pokeapi.model.resource.pokemon;

import com.triceracode.pokeapi.model.GenerationGameIndex;
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
public class Type extends Endpointable {

    private Long id;
    private String name;
    private TypeRelations damageRelations;
    private List<TypeRelationsPast> pastDamageRelations;
    private List<GenerationGameIndex> gameIndices;
    private NamedAPIResource generation;
    private NamedAPIResource moveDamageClass;
    private List<Name> names;
    private List<TypePokemon> pokemon;
    private List<NamedAPIResource> moves;

}
