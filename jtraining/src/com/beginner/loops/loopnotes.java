package com.beginner.loops;

public class loopnotes {
    public static void main(String[] args) {
        // loops - repeat code until a specific condition is met
        /* while - java will keep continuing execution of code until condition is true

        while (condition) {
            ...
        }

ex:     int i = 1
        while (i <= 100) {
            System.out.println("BEING RIGHT SUCKS");
            ++i;

        }

        */

        /* do-while - checks condition before it starts running; if true, the loops runs; if false, it skips the loop

        do {
            ...
        } while (condition);

ex:     int i = 1;
        do {
            System.out.println("BEING RIGHT SUCKS");
            ++I;
        } while (i <= 100);

        */

        /* for - if true, keeps running code; if false, it stops execution of code

        for (initialization; condition; updates statement) {
            ...
        }

ex:     for (int i = 1; i <= 100; i++) {
            System.out.println("BEING RIGHT SUCKS");
        }

        */

        // we can also put a loop into another loop
        /*

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("BEING RIGHT SUCKS");
            }
        }
        // the code will print the string 1000 times

        */

        // continue & break - cont is for skipping steps; break is for stopping loop
        /*

cont:   for (int i = 1; i <= 100; i++) {
            if ( i == 10) {
                continue;
        }
            System.out.printIn(“BEING RIGHT SUCKS");
        }
        // loop goes on, when value of i is ten, we skip tenth print statement
        // 99 lines will be printed from this code because 10th print is skipped

break:  for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                break;
            }
            System.out.println("BEING RIGHT SUCKS");
        }
        // after printing text 9 times, loop will be stopped by break, as it breaks the entire loop

        */


    }
}





















