package com.example.caculasquareadapter;

public class Shape {
    private String name_shape;
    private int img_shape;

    public Shape(String name_shape, int img_shape) {
        this.name_shape = name_shape;
        this.img_shape = img_shape;
    }

    public String getName_shape() {
        return this.name_shape;
    }

    public void setName_shape(String name_shape) {
        this.name_shape = name_shape;
    }

    public int getImg_shape() {
        return this.img_shape;
    }

    public void setImg_shape(int img_shape) {
        this.img_shape = img_shape;
    }
}
