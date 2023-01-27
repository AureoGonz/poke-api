package com.triceracode.pokeapi.endpoint.contest.type.model;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContestName {

    private String name;
    private String color;
    private NamedAPIResource language;

}
