package com.epam.starbucks.products.coffee.types;

import com.epam.starbucks.products.coffee.Coffee;

public class Mochas extends Coffee {
    private final String name = "Mochas";
    private final int cost = 17;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}