package com.codemanship.shoppingbasket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTotalTest {
    @Test
    void totalOfEmptyBasket(){
        Basket basket = new Basket();
        assertEquals(basket.total(), 0.0, 0);
    }

    @Test
    void totalOfSingleItem(){
        Basket basket = new Basket();
        Item item = new Item(100.0, 1);
        basket.add(item);
        assertEquals(basket.total(), 100.0, 0);
    }
}
