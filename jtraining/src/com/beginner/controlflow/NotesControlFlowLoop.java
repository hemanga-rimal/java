package com.beginner.controlflow;

public class NotesControlFlowLoop {
    public static void main(String[] args) {

        /* control flow - decision making and it enables
        program to conditionally execute different code blocks

        if statement

        if (condition) {
            ...
        }

ex:     if (isDamaged) {
            System.out.println("Damaged car");
        }

ex      if (horsepower > 500) {
            System.out.println("This car is fast!");
        }

ex:     if (movieRating > 6.8 && (movieCategory.equals("action")
            || movieCategory.equals("comedy"))){
                System.out.printIn("I'd watch it tonight.");
        }

        if-else statement

        if (condition) {
            ...
        } else {
            ...
        }

ex:     if (isDamaged) {
            System.out.println("Damaged car");
        } else {
            System.out.println("Accident free");
        }

ex:     if (horsepower > 500) {
            System.out.println("This car is fast!");
        } else {
            System.out.println("Well, not that bad.");
        }

ex:     if (movieRating > 6.8 && (movieCategory.equals("action")
            || movieCategory.equals("comedy"))){
                System.out.printIn("I'd watch it tonight.");
        } else {
            System.out.println("No way I'm watching this!");
        }

        if-else statement v2

        if (condition) {
            ...
        } else if (condition) {
            ...
        }

ex:     if (carColor.equals("red")) {
            System.out.println("It's a red car.");
        } else if (carColor.equals("green")) {
            System.out.println("It's a green car.");
        }

        if-else statement v3

        if (condition) {
            ...
        } else if (condition) {
            ...
        } else {
            ...
        }

ex:     if (carColor.equals("red")) {
            System.out.println("It's a red car.");
        } else if (carColor.equals("green")) {
            System.out.println("It's a green car.");
        } else {
            System.out.println("No idea what color this car is.");
        }

        switch statement

        switch (value) {
            case value1:
                ...
                break
            case value2:
                ...
            default:
                ...
        }

        switch expression is evaluated once, when the value is compared with the value of the cases
        if there's a match, associated block of code is executed
        when break is reached, the execution is stopped, executes the default keyword
        no case match is found

ex:     switch (carColor) {
            case "red":
                System.out.printIn(“This car is red.");
                break;
            case "green":
                System.out.printIn("This car is green.");
                break;
            default:
                System.out.println("No idea what color this car is.");
        }

        this expression will take the value of carColor, compare it w/ the two cases,
        if it matches one of them, it'll print the corresponding string and stop further execution, if no
        match, the default is printed

        switch is good in cases with many options, where the belonging code is short


        */

    }
}
