package com.epam.starbucks.main;

import com.epam.starbucks.process.*;
import com.epam.starbucks.product.ProductCollection;
import com.epam.starbucks.product.coffeebean.CoffeeBean;
import com.epam.starbucks.product.coffeebean.type.*;
import com.epam.starbucks.product.coffeedrink.Coffee;
import com.epam.starbucks.product.coffeedrink.type.*;

import java.io.IOException;
import java.util.*;

public class Order {
    public static void main(String[] args) throws IOException {

        Pay pay = new Pay();
        int currentPrice = 0;

        Map<Integer, Coffee> coffeeCollection = ProductCollection.getCoffeeCollection();
        Map<Integer, CoffeeBean> coffeeBeanCollection = ProductCollection.getCoffeeBeanCollection();

        System.out.println("МЕНЮ -- Наименования кофе:");
        for (int i=1; i<=coffeeCollection.size(); i++) {
            System.out.println(coffeeCollection.get(i) + "\t Код: " + i);
        }

        System.out.println("     -- Наименования зерен:");
        for (int i=1; i<=coffeeBeanCollection.size(); i++) {
            System.out.println(coffeeBeanCollection.get(i) + "\t Код: " + i);
        }

        System.out.print("Введите код наименования кофе: ");
        Coffee coffeeOrdered = CoffeeMenu.coffeeMenu(coffeeCollection);

        if (coffeeOrdered != null) {
            System.out.println("Вы выбрали кофе " + coffeeOrdered.getName());
        }

        System.out.print("Введите код наименования зерен: ");
        CoffeeBean coffeeBeansOrdered = CoffeeBeanMenu.coffeeBeanMenu(coffeeBeanCollection);

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
