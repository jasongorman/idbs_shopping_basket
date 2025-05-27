package com.codemanship.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Item> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public double total() {
        return items.stream()
                .mapToDouble(item -> subtotal(item))
                .sum();
    }

    private double subtotal(Item item) {
        return item.getPrice() * item.getQuantity();
    }

    public void add(Item item) {
        items.add(item);
    }
}
