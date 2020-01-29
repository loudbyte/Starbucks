package com.epam.starbucks.main;

import com.epam.starbucks.process.*;
import com.epam.starbucks.products.coffee.Coffee;
import com.epam.starbucks.products.coffee.types.*;
import com.epam.starbucks.products.coffee.beans.CoffeeBeans;
import com.epam.starbucks.products.coffee.beans.types.*;

import java.io.IOException;
import java.util.*;


public class Order {
    public static void main(String[] args) throws IOException {

        Pay pay = new Pay();
        int currentPrice = 0;

        Map<Integer, Coffee> coffeeCollection = new HashMap<>();
        coffeeCollection.put(1, new Americano());
        coffeeCollection.put(2, new Cappuccino());
        coffeeCollection.put(3, new Latte());
        coffeeCollection.put(4, new Macchiatos());
        coffeeCollection.put(5, new Mochas());

        Map<Integer, CoffeeBeans> coffeeBeansCollection = new HashMap<>();
        coffeeBeansCollection.put(1, new Blonde());
        coffeeBeansCollection.put(2, new Espresso());

        System.out.println("МЕНЮ -- Наименования кофе:");
        for (int i=1; i<=coffeeCollection.size(); i++) {
            System.out.println(coffeeCollection.get(i) + "\t Код: " + i);
        }
        System.out.println("     -- Наименования зерен:");
        for (int i=1; i<=coffeeBeansCollection.size(); i++) {
            System.out.println(coffeeBeansCollection.get(i) + "\t Код: " + i);
        }

        System.out.print("Введите код наименования кофе: ");
        Coffee coffeeOrdered = CoffeeMenu.coffeeMenu(coffeeCollection);

        if (coffeeOrdered != null) {
            System.out.println("Вы выбрали кофе " + coffeeOrdered.getName());
        }

        System.out.print("Введите код наименования зерен: ");
        CoffeeBeans coffeeBeansOrdered = CoffeeBeansMenu.coffeeBeansMenu(coffeeBeansCollection);

        if (coffeeOrdered != null) {
            System.out.println("Вы выбрали зерна:  " + coffeeOrdered.getName());
        }

        currentPrice = coffeeOrdered.getCost() + coffeeBeansOrdered.getCost();

        System.out.println(
                "Вы заказали " + coffeeOrdered.getName() +
                        " " + coffeeBeansOrdered.getName() + ". К оплате: " + currentPrice + "$\nВведите сумму: ");

        pay.payment(currentPrice);
    }
}
