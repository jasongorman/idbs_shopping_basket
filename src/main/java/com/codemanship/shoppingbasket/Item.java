package com.codemanship.shoppingbasket;

public class Item {
    private double price;
    private double quantity;

    public Item(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    double subtotal() {
        return price * quantity;
    }
}
