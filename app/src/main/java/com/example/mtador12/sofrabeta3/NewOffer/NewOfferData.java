package com.example.mtador12.sofrabeta3.NewOffer;

public class NewOfferData {
    private String name;
    private int image;

    public NewOfferData() {
    }

    public NewOfferData(String name, int image) {
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
