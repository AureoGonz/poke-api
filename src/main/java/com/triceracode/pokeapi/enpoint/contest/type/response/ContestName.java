package com.triceracode.pokeapi.enpoint.contest.type.response;

import com.triceracode.pokeapi.commonModels.NamedAPIResource;
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
