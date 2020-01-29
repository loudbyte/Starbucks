package com.epam.starbucks.products.coffee.beans.types;

import com.epam.starbucks.products.coffee.beans.CoffeeBeans;

public class Blonde extends CoffeeBeans {

    private final String name = "Blonde";
    private final int cost = 3;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }


}
