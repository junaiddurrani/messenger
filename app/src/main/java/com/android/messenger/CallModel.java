package com.android.messenger;

public class CallModel {
    private String name, time;
    private int image;

    public CallModel() {
    }

    public CallModel(int image, String name, String time) {
        this.image = image;
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
