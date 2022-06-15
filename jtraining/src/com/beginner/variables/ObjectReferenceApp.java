package com.beginner.variables;

import java.util.Locale;

public class ObjectReferenceApp {

    public static void main(String[] args) {
        Byte numberSeats = 5;
        Short horsePower = 390;
        Integer price = 65000;
        Long registrationNumber = 3867344823473L;

        Float totalFuelConsumption = 16.5F;
        Double fuelConsumptionPrecise = 16.32545542342342;

        Boolean isDamaged = false;
        Character energyEfficiencyCategory = 'G';

        String carModel = "1996 Toyota Supra";
        String carModelNew = "1996 Toyota Supra";
        // both give same result, first is simpler

        System.out.println("Number of seats: " + numberSeats);
        System.out.println("Horsepower: " + horsePower);
        System.out.println("Price: $" + price.floatValue());
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Total fuel consumption: " + totalFuelConsumption);
        System.out.println("Precise fuel consumption " + fuelConsumptionPrecise.intValue());
        System.out.println("This car is damaged: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);

        System.out.println("The car model: " + carModel);
        System.out.println("The car model with uppercase: " + carModel.toUpperCase());
        System.out.println("The car model with lowercase: " + carModel.toLowerCase());
        System.out.println("Car model and car model with new keyword are equal: " + carModel.equals(carModelNew));
        System.out.println("The car model with new keyword: " + carModelNew);

    }

}

// why operators are needed:
// need to change value of variable
// they're used to perform operations on variables and values
// 4 types:
// assignment. arithmetic, unary, equality and relational, ternary, logical
// assignment:
// =, assign value to variable, ex: int price = 5;
// arithmetic:
// +, addition (also used for string concatenation), ex: int price = 5 + 5; = 10
// -, subtraction, ex: int price = 5 - 5; = 0
// *, multiplication, ex: int price = 5 * 5; = 25
// /, division (returns whole number), ex: int price 5 / 3; = 1
// %, remainder, ex: int price = 5 % 3; = 2

// 5 % 3 == 5 - 5/3 * 3
// int price = 10 % 5; = 0
// 10 % 5 == 10 - 10/5 * 5
// int price = 13 % 7; = 6
// 13 % 7 == 13 - 13/7 * 7 = 6
// subtract right num from left num as many times as possible, whatever remains is remainder

// unary operators:
// +, doesn't make a value positive(useless), ex: int price = + (-5); = -5
// -, inverts the sign of an expression, ex: int price = -(-5); = 5
// ++, increments value by 1, ex: int price = 5++; = 6
// --, decrements value by 1, ex: int price = 5--; = 4
// ! inverts value of a boolean, ex: boolean isDamaged = !=true; = false

// equality and relational operators:
// ==, equal to, ex: 5 == 5; = true
// !=, not equal to, ex: 5!= 5; = false
// >, greater than
// <, less than
// >=, greater than or equal to
// <=, less than or equal to
// instanceof, data type comparison, ex: carType instanceof String; = true

// ternary operator:
// variableName = expression ? value1 : value2
// if true, value1 assigned, if false, value2 assigned
// damageText = isDamaged ? "This car is damaged" : "This car isn't damaged";

// logical operators:
// ||, or - true if either of boolean expression is true, ex: false || true; = true
// && and - true if all boolean expressions are true, ex: false && true; = false

// assignment operators:
// =, assign value to variable
// +=, ass and equals, ex: price += 5; = 10 -> replaces price = price + 5;
// -=, subtract and equals, ex: price -= 5; -> replaces price = price - 5;
// *=, multiply and equals, ex: *= 3; = 15 -> replaces price = price * 3;
// /=, divide and equals, ex: price /= 3; = 1 -> replaces price = price / 3;
// %=, remainder and equals, ex: price %= 3; = 2 -> replaces price = price % 3;

// bitwise and bitshift operators
// |, bitwise OR
// & bitwise AND
// >> right shift
// << left shift
// >>> unsigned right shift
// ~ bitwise complement
// ^ bitwise XOR



