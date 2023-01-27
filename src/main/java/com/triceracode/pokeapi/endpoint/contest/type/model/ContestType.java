package com.triceracode.pokeapi.endpoint.contest.type.model;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContestType {

    private Long id;
    private String name;
    private NamedAPIResource berryFlavor;
    private List<ContestName> names;

}
