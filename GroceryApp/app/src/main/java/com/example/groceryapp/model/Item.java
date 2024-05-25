package com.example.groceryapp.model;

import android.widget.TextView;

public class Item {
    private String main_title;
    private String sub_title;

    public Item(String main_title, String sub_title) {
        this.main_title = main_title;
        this.sub_title = sub_title;
    }

    public String getMain_title() {
        return main_title;
    }

    public void setMain_title(String main_title) {
        this.main_title = main_title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }
}
