package com.example.mvp_weatherapi.rest.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Icon implements Serializable {
    @Expose
    @SerializedName("icon")
    private String icon;

    public String getIcon() {
        return icon;
    }
}
