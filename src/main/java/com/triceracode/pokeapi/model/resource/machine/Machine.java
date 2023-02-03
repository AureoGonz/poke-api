package com.triceracode.pokeapi.model.resource.machine;

import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Machine extends Endpointable {

    private Long id;
    private NamedAPIResource item;
    private NamedAPIResource move;
    private NamedAPIResource versionGroup;

}
