package com.epam.starbucks.product.coffeedrink.type;

import com.epam.starbucks.product.coffeedrink.Coffee;

public class Americano extends Coffee {

    private static String name = "Americano";
    private static int cost = 10;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
