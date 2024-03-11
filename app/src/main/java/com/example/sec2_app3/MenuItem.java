package com.example.sec2_app3;

import androidx.annotation.NonNull;

public class MenuItem {
    private String name;
    private double price;
    private String category;

    public MenuItem(){}

    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @NonNull
    @Override
    public String toString() {
        String msg = getName() + ", Price= " + getPrice();
        return msg;
    }
}
