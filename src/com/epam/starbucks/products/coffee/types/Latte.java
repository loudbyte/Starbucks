package com.epam.starbucks.products.coffee.types;

import com.epam.starbucks.products.coffee.Coffee;

public class Latte extends Coffee {
    private final String name = "Latte";
    private final int cost = 14;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
