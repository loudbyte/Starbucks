package com.epam.starbucks.product.coffeebean.type;

import com.epam.starbucks.product.coffeebean.CoffeeBean;

public class Blonde extends CoffeeBean {

    private static String name = "Blonde";
    private static int cost = 3;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
