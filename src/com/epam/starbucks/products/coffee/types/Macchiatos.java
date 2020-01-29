package com.epam.starbucks.products.coffee.types;

import com.epam.starbucks.products.coffee.Coffee;

public class Macchiatos extends Coffee {
    private final String name = "Macchiatos";
    private final int cost = 9;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}