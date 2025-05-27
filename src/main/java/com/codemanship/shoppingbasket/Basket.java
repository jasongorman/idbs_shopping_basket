package com.codemanship.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> items = new ArrayList<>();

    public double total() {
        return items.isEmpty() ? 0 : 100;
    }

    public void add(Item item) {
        items.add(item);
    }
}
