package com.epam.starbucks.process;

import com.epam.starbucks.process.validator.NumberValidator;
import com.epam.starbucks.product.coffeedrink.Coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class CoffeeMenu {
    public static Coffee coffeeMenu(Map<Integer, Coffee> coffeeCollection) throws IOException {

        int coffeeCode = 0;

        BufferedReader readerCoffee = new BufferedReader(new InputStreamReader(System.in));
        String reader = readerCoffee.readLine();

        if(NumberValidator.isNumeric(reader)) {
           coffeeCode = Integer.parseInt(reader);
        } else {
            System.out.println("Вы ввели не число.");
            System.exit(-1);
        }

        Coffee coffeeOrdered = null;

        switch (coffeeCode) {
            case 1:
                coffeeOrdered = coffeeCollection.get(1);
                break;
            case 2:
                coffeeOrdered = coffeeCollection.get(2);
                break;
            case 3:
                coffeeOrdered = coffeeCollection.get(3);
                break;
            case 4:
                coffeeOrdered = coffeeCollection.get(4);
                break;
            case 5:
                coffeeOrdered = coffeeCollection.get(5);
                break;
            default:
                System.out.println("Некорректное наименование.");
        }
        return coffeeOrdered;
    }
}
