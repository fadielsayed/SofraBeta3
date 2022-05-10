package com.example.mtador12.sofrabeta3.Notify;

public class NotifyData {
    private String name;
    private int image;

    public NotifyData() {
    }

    public NotifyData(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
