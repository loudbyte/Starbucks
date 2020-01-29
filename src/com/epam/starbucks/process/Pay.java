package com.epam.starbucks.process;

import com.epam.starbucks.products.coffee.Coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Pay {
    private int currentPrice = 0;

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void payment(int currentPrice) {

        int userPayment = 0;

        BufferedReader readerPayment = new BufferedReader(new InputStreamReader(System.in));
        String reader = null;
        try {
            reader = readerPayment.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(IsNumber.isNumeric(reader)) {
            userPayment = Integer.parseInt(reader);
        } else {
            System.out.println("Вы ввели не число.");
            System.exit(-1);
        }


        if(userPayment == currentPrice) {
            createOrder();
        } else if (userPayment > currentPrice) {
            System.out.println("Возмите сдачу: " + (userPayment - currentPrice) + "$");
            createOrder();
        } else {
            System.out.println("Недостаточно денег.");
        }
    }

    private void createOrder() {
        System.out.println("Ожидайте");
        for (int i=0; i<7; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.print("-");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nВаш кофе готов. Приятного аппетита!");
    }
}
