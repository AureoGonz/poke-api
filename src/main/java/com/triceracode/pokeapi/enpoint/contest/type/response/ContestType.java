package com.triceracode.pokeapi.enpoint.contest.type.response;

import com.triceracode.pokeapi.commonModels.NamedAPIResource;
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
