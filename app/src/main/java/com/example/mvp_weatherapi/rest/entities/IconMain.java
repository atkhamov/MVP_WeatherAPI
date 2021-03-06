package com.example.mvp_weatherapi.rest.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.List;

public class IconMain {

    @Expose
    @SerializedName("weather")
    private List<Icon> iconList;

    public IconMain(List<Icon> iconList) {
        this.iconList = iconList;
    }

    public List<Icon> getIconList() {
        return iconList;
    }
}
