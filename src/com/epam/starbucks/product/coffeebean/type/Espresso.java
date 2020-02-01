package com.epam.starbucks.product.coffeebean.type;

import com.epam.starbucks.product.coffeebean.CoffeeBean;

public class Espresso extends CoffeeBean {

    private static String name = "Espresso";
    private static int cost = 5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
