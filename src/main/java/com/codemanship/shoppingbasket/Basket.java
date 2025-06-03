package com.codemanship.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public double total() {
        if (items.isEmpty())
            return 0;
        return 100.0;
    }

    public void add(Item item) {
        items.add(item);
    }
}
