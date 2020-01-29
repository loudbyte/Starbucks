package com.epam.starbucks.products.coffee;

import com.epam.starbucks.products.coffee.types.Americano;

import java.util.HashMap;
import java.util.Map;

public class CoffeeCollection {

    public CoffeeCollection() {
        Map<Integer, Coffee> coffeeCollection = new HashMap<>();
        coffeeCollection.put(1, new Americano());
    }



}
