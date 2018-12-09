package com.android.messenger;

public class MessagesModel {
    private String name, message, time;
    private int image, image2;

    public MessagesModel() {
    }

    public MessagesModel(int image, int image2, String name, String time, String message) {
        this.name = name;
        this.message = message;
        this.time = time;
        this.image = image;
        this.image2 = image2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }
}
