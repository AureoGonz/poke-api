package com.triceracode.pokeapi.model.resource.game;

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
public class Version extends Endpointable {

    private Long id;
    private String name;
    private List<Name> names;
    private NamedAPIResource versionGroup;

}
