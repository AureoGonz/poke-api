package com.triceracode.pokeapi.model.resource.pokemon;

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
public class Nature extends Endpointable {

    private Long id;
    private String name;
    private NamedAPIResource decreasedStat;
    private NamedAPIResource increasedStat;
    private NamedAPIResource hatesFlavor;
    private NamedAPIResource likesFlavor;
    private List<NatureStatChange> pokeathlonStatChanges;
    private List<MoveBattleStylePreference> moveBattleStylePreferences;
    private List<Name> names;

}
