package com.triceracode.pokeapi.model.resource.item;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class ItemSprites {

    @SerializedName("default")
    private String _default;

    public String getDefault() {
        return this._default;
    }

}
