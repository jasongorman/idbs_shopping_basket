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
                .mapToDouble(Item::subtotal)
                .sum();
    }

    public void add(Item item) {
        items.add(item);
    }
}
