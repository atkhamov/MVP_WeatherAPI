package com.example.mvp_weatherapi.rest.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CityName implements Serializable {
    @Expose
    @SerializedName("name")
    private String name;

    public String getName23() {
        return name;
    }
}
