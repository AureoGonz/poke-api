package com.triceracode.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class APIResource {

    private Long id;
    private String url;

    public Long getId() {
        String[] chunk = this.url.split("/");
        if(this.id == null) {
            try {
                this.id = Long.valueOf(chunk[chunk.length - 1]);
            } catch (Exception ignore) {
                return null;
            }
        }
        return this.id;
    }

}
