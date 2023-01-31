package com.triceracode.pokeapi.model.resource.encounter;

import com.triceracode.pokeapi.model.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class EncounterMethod {

    private Long id;
    private String name;
    private Integer order;
    private List<Name> names;

}
