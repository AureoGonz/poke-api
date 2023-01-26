package com.triceracode.pokeapi.enpoint.pokemon.response;

import com.triceracode.pokeapi.commonModels.Effect;
import com.triceracode.pokeapi.commonModels.Name;
import com.triceracode.pokeapi.commonModels.NamedAPIResource;
import com.triceracode.pokeapi.commonModels.VerboseEffect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ability {

    private Long id;
    private String name;
    private boolean isMainSeries;
    private NamedAPIResource generation;
    private List<Name> names;
    private List<VerboseEffect> effectEntries;
    private List<AbilityEffectChange> effectChanges;
    private List<AbilityFlavorText> flavorTextEntries;
    private List<AbilityPokemon> pokemon;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AbilityEffectChange {

        private List<Effect> effectEntries;
        private NamedAPIResource versionGroup;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AbilityFlavorText {

        private String flavorText;
        private NamedAPIResource language;
        private NamedAPIResource versionGroup;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AbilityPokemon {

        private Boolean isHidden;
        private Integer slot;
        private NamedAPIResource pokemon;

    }
}
