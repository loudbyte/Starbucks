package com.epam.starbucks.product.coffeedrink.type;

import com.epam.starbucks.product.coffeedrink.Coffee;

public class Cappuccino extends Coffee {

    private static String name = "Cappuccino";
    private static int cost = 12;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
