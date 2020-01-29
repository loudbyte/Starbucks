package com.epam.starbucks.products.coffee.types;

import com.epam.starbucks.products.coffee.Coffee;

public class Americano extends Coffee {
    private final String name = "Americano";
    private final int cost = 10;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;

    }


}
