package com.example.planetsapp;

public class Planet {
    private String planet_Name;
    private String moon_Count;
    private int planet_Image;

    public Planet(String planet_Mame, String moon_Count, int planet_Image) {
        this.planet_Name = planet_Mame;
        this.moon_Count = moon_Count;
        this.planet_Image = planet_Image;
    }

    public String getPlanet_Name() {
        return planet_Name;
    }

    public String getMoon_Count() {
        return moon_Count;
    }

    public int getPlanet_Image() {
        return planet_Image;
    }

    public void setPlanet_Name(String planet_Name) {
        this.planet_Name = planet_Name;
    }

    public void setMoon_Count(String moon_Count) {
        this.moon_Count = moon_Count;
    }

    public void setPlanet_Image(int planet_Image) {
        this.planet_Image = planet_Image;
    }
}
