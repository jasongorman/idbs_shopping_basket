package com.codemanship.shoppingbasket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTotalTest {
    @Test
    void totalOfEmptyBasket(){
        Basket basket = new Basket();
        assertEquals(0.0, basket.total(), 0);
    }

    @Test
    void totalOfSingleItem(){
        Basket basket = new Basket();
        basket.add(new Item(100.0, 1));
        assertEquals(100.0, basket.total(), 0);
    }

    @Test
    void totalOfTwoItems(){
        Basket basket = new Basket();
        basket.add(new Item(75.0, 1));
        basket.add(new Item(50.0, 1));
        assertEquals(125.0, basket.total(), 0);
    }
    @Test
    void totalOfItemWithQuantityOfTwo(){
        Basket basket = new Basket();
        basket.add(new Item(75.0, 2));
        assertEquals(150.0, basket.total(), 0);
    }
}
