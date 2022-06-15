package basics;

public class cities {

    public static void main(String[] args) {
        // declare and define an array
        String[] cities = {"new york", "san francisco", "miami", "dallas"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);

        // declare array
        String[] countries;

        // define the array
        countries = new String[3];
        countries[0] = "usa";
        countries[1] = "canada";
        countries[2] = "uk";
        System.out.println(countries[1]);

        System.out.println("*****************");

        // declare and the array (only size)
        String[] states = new String[5];
        states[0] = "california";
        states[1] = "ohio";
        states[2] = "new jersey";
        states[3] = "texas";
        states[4] = "utah";
        int i = 0;

        // do loop: enters the loop THEN tests the condition
        do {
            System.out.println("STATE: " + states[i]);
            i = i + 1;
        } while (i < 5);

        // while loop: tests condition first then enters loop
        int n = 0;
        boolean stateFound = false;
        while (!stateFound) {
            String state = states[n];
            System.out.println(state);
            if (state == "texas") {
                System.out.println("STATE FOUND!");
                stateFound = true;
            }
            n++;
        }

        System.out.println("\nPRINTING WITH FOR LOOP");
        // for loop: best structure for iterating through an array
        for (int x = 0; x < 5; x++) {
            System.out.println(states[x]);
        }

    }
}
