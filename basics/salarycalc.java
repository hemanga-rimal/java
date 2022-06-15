package basics;

public class salarycalc {
    public static void main(String[] args) {
        // create variable to define career

        // declare variable
        String career;
        System.out.println("program is starting");

        // define variable
        career = "software developer";
        System.out.println("my career is: " + career);

        // declare & define
        int hoursPerWeek = 40;
        int weeksPerYear = 52;
        double rate = 42.50;
        career = "web developer";



        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("my salary as a " + career + " at the rate of $" + rate + " is $" + salary + " per year");

        // compute annual salary
        // rate * hrs/week * weeks/yr

    }
}
