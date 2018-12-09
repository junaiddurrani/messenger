package com.android.messenger;

public class ActiveModel {
    private String name;
    private int image;

    public ActiveModel() {
    }

    public ActiveModel(int image, String name) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
