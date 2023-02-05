package com.triceracode.pokeapi.model.resource.pokemon;

import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Characteristic extends Endpointable {

    private Long id;
    private Integer geneModulo;
    private List<Integer> possibleValues;

}
