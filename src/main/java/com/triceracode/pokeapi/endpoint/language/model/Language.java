package com.triceracode.pokeapi.endpoint.language.model;

import com.triceracode.pokeapi.model.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language {

    private Long id;
    private String name;
    private Boolean official;
    private String iso639;
    private String iso3166;
    private List<Name> names;

}
