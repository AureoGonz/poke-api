package com.triceracode.pokeapi.model.resource.contest;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class ContestName {

    private String name;
    private String color;
    private NamedAPIResource language;

}
