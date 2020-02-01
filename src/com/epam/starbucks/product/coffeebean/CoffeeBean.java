package com.epam.starbucks.product.coffeebean;

public abstract class CoffeeBean {

    public abstract String getName();
    public abstract int getCost();

    @Override
    public String toString() {
        return getName() + ":\t" + getCost() + "$";
    }
}
