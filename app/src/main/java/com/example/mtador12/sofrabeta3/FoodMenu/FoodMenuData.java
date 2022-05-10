package com.example.mtador12.sofrabeta3.FoodMenu;

public class FoodMenuData {
    private String Name;
    private String price;
    private int photo;

    public FoodMenuData() {
    }

    public FoodMenuData(String name, String price, int photo) {
        Name = name;
        this.price = price;
        this.photo = photo;
    }

    public String getName() {
        return Name;
    }

    public String getPrice() {
        return price;
    }

    public int getPhoto() {
        return photo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
