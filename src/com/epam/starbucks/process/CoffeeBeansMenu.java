package com.epam.starbucks.process;

import com.epam.starbucks.products.coffee.beans.CoffeeBeans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class CoffeeBeansMenu {
    public static CoffeeBeans coffeeBeansMenu(Map<Integer, CoffeeBeans> coffeeCollection) throws IOException {
        int coffeeCode = 0;

        BufferedReader readerCoffee = new BufferedReader(new InputStreamReader(System.in));
        String reader = readerCoffee.readLine();
        if(IsNumber.isNumeric(reader)) {
            coffeeCode = Integer.parseInt(reader);
        } else {
            System.out.println("Вы ввели не число.");
            System.exit(-1);
        }

        CoffeeBeans coffeeOrdered = null;
        switch (coffeeCode) {
            case 1:
                coffeeOrdered = coffeeCollection.get(1);
                break;
            case (2):
                coffeeOrdered = coffeeCollection.get(2);
                break;
            default:
                System.out.println("Некорректное наименование.");
        }

        return coffeeOrdered;
    }
}
