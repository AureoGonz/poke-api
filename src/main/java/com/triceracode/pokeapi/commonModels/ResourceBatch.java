package com.triceracode.pokeapi.commonModels;

import com.triceracode.pokeapi.commonModels.NamedAPIResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceBatch {

    private Long count;
    private String next;
    private String previous;
    private List<NamedAPIResource> results;

}
