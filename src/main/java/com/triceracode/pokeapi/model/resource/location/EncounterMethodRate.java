package com.triceracode.pokeapi.model.resource.location;

import com.triceracode.pokeapi.model.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class EncounterMethodRate {

    private NamedAPIResource encounterMethod;
    private List<EncounterVersionDetails> versionDetails;

}
