package com.triceracode.pokeapi.model.resource.move;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class ContestComboDetail {

    private List<NamedAPIResource> useBefore;
    private List<NamedAPIResource> useAfter;

}
