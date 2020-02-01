package com.epam.starbucks.product.coffeedrink.type;

import com.epam.starbucks.product.coffeedrink.Coffee;

public class Macchiatos extends Coffee {

    private static String name = "Macchiatos";
    private static int cost = 9;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}