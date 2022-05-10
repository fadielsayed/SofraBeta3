package com.example.mtador12.sofrabeta3.Orders;

public class ExistingorderData {
    private String name;
    private int photo;

    public ExistingorderData() {
    }

    public ExistingorderData(String name, int photo) {
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
