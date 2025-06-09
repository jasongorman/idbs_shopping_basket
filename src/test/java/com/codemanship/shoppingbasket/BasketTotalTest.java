package com.codemanship.shoppingbasket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTotalTest {
    @Test
    void totalOfEmptyBasket(){
        Basket basket = new Basket();
        assertEquals(0.0, basket.total(), 0);
    }
}
