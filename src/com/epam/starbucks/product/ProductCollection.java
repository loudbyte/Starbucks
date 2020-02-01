package com.epam.starbucks.product;

import com.epam.starbucks.product.coffeebean.CoffeeBean;
import com.epam.starbucks.product.coffeedrink.Coffee;
import com.epam.starbucks.product.coffeebean.type.*;
import com.epam.starbucks.product.coffeedrink.type.*;

import java.util.HashMap;
import java.util.Map;

public class ProductCollection {

    private static Map<Integer, Coffee> coffeeCollection = new HashMap<>();
    static {
        coffeeCollection.put(1, new Americano());
        coffeeCollection.put(2, new Cappuccino());
        coffeeCollection.put(3, new Latte());
        coffeeCollection.put(4, new Macchiatos());
        coffeeCollection.put(5, new Mochas());
    }

    private static Map<Integer, CoffeeBean> coffeeBeanCollection = new HashMap<>();
    static {
        coffeeBeanCollection.put(1, new Blonde());
        coffeeBeanCollection.put(2, new Espresso());
    }

    public static Map<Integer, Coffee> getCoffeeCollection() {
        return coffeeCollection;
    }

    public static Map<Integer, CoffeeBean> getCoffeeBeanCollection() {
        return coffeeBeanCollection;
    }
}
