package com.epam.starbucks.product.coffeedrink.type;

import com.epam.starbucks.product.coffeedrink.Coffee;

public class Mochas extends Coffee {

    private static String name = "Mochas";
    private static int cost = 17;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}