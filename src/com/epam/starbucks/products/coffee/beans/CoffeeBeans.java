package com.epam.starbucks.products.coffee.beans;

public abstract class CoffeeBeans {
    public abstract String getName();
    public abstract int getCost();

    @Override
    public String toString() {
        return getName() + ":\t" + getCost() + "$";
    }

}
