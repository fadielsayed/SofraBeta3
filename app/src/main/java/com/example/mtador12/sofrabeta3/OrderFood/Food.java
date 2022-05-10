package com.example.mtador12.sofrabeta3.OrderFood;

public class Food {

    private String name;
    private int photo;

    public Food() {
    }

    public Food(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
