package com.beginner.methods;

public class FunctionApp {
    public static void main(String[] args) {

        sayHello();
        blackboardPunishment(5);
        System.out.println("The price with 10% off: " + getTenPercentOffDiscountPrice(20000));

    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void blackboardPunishment (int repeatNumber) {
        for (int i = 1; i <= repeatNumber; i++) {
            System.out.println("BEING RIGHT SUCKS");
        }
    }

    static double getTenPercentOffDiscountPrice(int price) {
        return price * 0.9;
    }
}
