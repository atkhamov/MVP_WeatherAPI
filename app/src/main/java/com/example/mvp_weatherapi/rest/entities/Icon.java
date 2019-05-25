package com.example.mvp_weatherapi.rest.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



/**
 * We need to implement Serializable only when we need to interchange the data between Activity
 * and Fragments.
 * Here, we do not need to implement Serializable*/

public class Icon {
    @Expose
    @SerializedName("icon")
    private String icon;

    public String getIcon() {
        return icon;
    }
}
