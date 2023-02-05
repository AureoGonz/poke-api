package com.triceracode.pokeapi.model.resource.move;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class MoveStatChange {

    private Integer change;
    private NamedAPIResource stat;

}
