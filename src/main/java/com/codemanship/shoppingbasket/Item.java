package com.codemanship.shoppingbasket;

public class Item {
    private double price;
    private double quantity;

    public Item(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}
