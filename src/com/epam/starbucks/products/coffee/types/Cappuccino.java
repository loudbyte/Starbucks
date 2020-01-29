package com.epam.starbucks.products.coffee.types;

import com.epam.starbucks.products.coffee.Coffee;

public class Cappuccino extends Coffee {
    private final String name = "Cappuccino";
    private final int cost = 12;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
