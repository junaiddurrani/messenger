package com.android.messenger;

public class GroupModel {
    private int image;
    private String name, time, member;

    public GroupModel() {
    }

    public GroupModel(int image, String name, String time, String member) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.member = member;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }
}
