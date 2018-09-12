package com.curiosoapp.poketeste.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PokePojo {

    @SerializedName("name")
    private String name;

    @SerializedName("abilities")
    private List<Abilities> abilities;

    @SerializedName("sprites")
    Sprites sprites;

}
