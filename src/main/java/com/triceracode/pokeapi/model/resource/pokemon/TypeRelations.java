package com.triceracode.pokeapi.model.resource.pokemon;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class TypeRelations {

    private List<NamedAPIResource> noDamageTo;
    private List<NamedAPIResource> halfDamageTo;
    private List<NamedAPIResource> doubleDamageTo;
    private List<NamedAPIResource> noDamageFrom;
    private List<NamedAPIResource> halfDamageFrom;
    private List<NamedAPIResource> doubleDamageFrom;

}
