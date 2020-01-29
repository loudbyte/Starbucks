package com.epam.starbucks.products.coffee;

public abstract class Coffee {
    public abstract String getName();
    public abstract int getCost();

    @Override
    public String toString() {
        return getName() + ":\t" + getCost() + "$";
    }

}
