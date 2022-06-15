package basics;

public class numberscalc {

    public static void main(String[] args) {
        System.out.println("program is starting");
        printName();
        int numA = 10;
        int numB = 20;
        addNumbers(numA, numB);
        int product = multiplyNumbers(numA, numB);
        System.out.println("the product of numbers " + numA + " and " + numB + " is " + product);
    }

    static void printName() {
        System.out.println("my name is hemanga");
    }

    static void addNumbers(int numberA, int numberB) {
        // this function will add two numbers
        int sum = numberA + numberB;
        System.out.println("the sum of numbers " + numberA + " and " + numberB + " is " + sum);
    }

    static int multiplyNumbers(int valueA, int valueB) {
        int product = valueA + valueB;
        addNumbers(product + 50, product);
        return product;
    }


}
