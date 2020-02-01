package com.epam.starbucks.product.coffeedrink.type;

import com.epam.starbucks.product.coffeedrink.Coffee;

public class Latte extends Coffee {

    private static String name = "Latte";
    private static int cost = 14;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
