package com.triceracode.pokeapi.model.resource.contest;

import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class ContestType extends Endpointable {

    private Long id;
    private String name;
    private NamedAPIResource berryFlavor;
    private List<ContestName> names;

}
