package com.beginner.controlflow;

public class controlFlowLoopsApp {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 0) {
            System.out.println( i + ". testing");
            i++;
        }
        System.out.println("Value of i: " + i);
        System.out.println();

        int j = 1;
        do {
            System.out.println( j + ". testing");
            j++;
        } while (j <= 0);
        System.out.println("Value of j: " + j);
        System.out.println();
        // while checks condition first, and if false, doesn't execute loop
        // do while runs code, then checks condition, hence why string is printed

        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println( k + ". testing");
        }
        //System.out.println("Value of k: " + k);
        System.out.println();
        // cannot resolve - this is because k is only accessible inside the loop

        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 2; l++) {
                System.out.println("k="+ k + " l=" + l + " testing.");
            }
            // this first runs the inner loop, then the outer loop
            // shown as value of l increases first, then k
            // printed out 10 times
        }
    }
}