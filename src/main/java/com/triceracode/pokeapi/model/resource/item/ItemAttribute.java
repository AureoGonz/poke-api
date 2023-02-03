package com.triceracode.pokeapi.model.resource.item;

import com.triceracode.pokeapi.model.Description;
import com.triceracode.pokeapi.model.NamedAPIResource;
import com.triceracode.pokeapi.model.resource.Endpointable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class ItemAttribute extends Endpointable {

    private Long id;
    private String name;
    private List<NamedAPIResource> items;
    private List<NamedAPIResource> names;
    private List<Description> descriptions;

}
