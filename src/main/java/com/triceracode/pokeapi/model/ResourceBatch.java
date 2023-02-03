package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class ResourceBatch {

    private Long count;
    private String next;
    private String previous;
    private List<NamedAPIResource> results;

}
