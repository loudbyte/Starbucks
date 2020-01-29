package com.epam.starbucks.products.coffee.beans.types;

import com.epam.starbucks.products.coffee.beans.CoffeeBeans;

public class Espresso extends CoffeeBeans {

    private final String name = "Espresso";
    private final int cost = 5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + ": " + cost + "$";
    }
}
