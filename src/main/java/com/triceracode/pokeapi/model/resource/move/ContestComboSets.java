package com.triceracode.pokeapi.model.resource.move;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class ContestComboSets {

    private ContestComboDetail normal;
    @SerializedName("super")
    private ContestComboDetail _super;

    public ContestComboDetail getNormal() {
        return this.normal;
    }

    public ContestComboDetail getSuper() {
        return this._super;
    }

}
