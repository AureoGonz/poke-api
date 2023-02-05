package com.triceracode.pokeapi.model.resource.pokemon;

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
public class PokemonForm extends Endpointable {

    private Long id;
    private String name;
    private Integer order;
    private Integer formOrder;
    private Boolean isDefault;
    private Boolean isBattleOnly;
    private Boolean isMega;
    private String formName;
    private NamedAPIResource pokemon;
    private List<PokemonFormType> types;
    private PokemonFormSprites sprites;
    private NamedAPIResource versionGroup;
    private List<Name> names;
    private List<Name> formNames;

}
