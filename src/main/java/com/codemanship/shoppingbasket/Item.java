package com.codemanship.shoppingbasket;

public class Item {
    private double price;

    public Item(double price, int quantity) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
