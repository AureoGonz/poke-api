package com.triceracode.pokeapi.model.resource.language;

import com.triceracode.pokeapi.model.Name;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Language extends Endpointable {

    private Long id;
    private String name;
    private Boolean official;
    private String iso639;
    private String iso3166;
    private List<Name> names;

}
