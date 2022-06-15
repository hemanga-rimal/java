package com.beginner.methods;

public class methodNotes {
    public static void main(String[] args) {

        /*

        methods can be used when we want to wrap conditions into a block and reuse it for different purposes

        methods analogy - imaginary machine, had one input and one output, had to figure out what it did
                          ex: input 5, output 15
                          in this case, it multiplied input by 3
                          sometimes, this "machine" can have multiple inputs
                          ex: 5 and 3 go into input, 15 is output, machine simply multiplies
                          in java you can have many inputs of different varieties, have no input or output,
                          or have input but no output

        method - a block of code which only runs when it's called

        how to create - returnType functionName() {
                            ...
                            returnDataType;
                        }

ex:     void sayGoodMorning() {
            System.out.println("Good morning!");
        }

        accessModifier static returnType functionName(parameters) {
            ...
        }

        - accessModifier can be public, private, or packaged
        - static shows java that function belongs to class instead of object
        - parameters are passed, can be used in function's block
            - example can be shown in main method - String[] args - an array of strings, named args

ex:     public double getTenPercentOffDiscountPrice(int price) {
            return price * 0.9;
        }

        - takes int price, multiplies it by 0.9, returns result
        - function should do one thing

        how to call

        functionName(parameters);

ex:     getTenPercentOffDiscountPrice(20000); - can use direct input
        getTenPercentOffDiscountPrice(price); - can use variable name

        double tenPercentOffDiscount price = getTenPercentOffDiscountPrice(20000); - can use assigned output
        System.out.println(getTenPercentOffDiscountPrice(20000); - can use the function as a parameter for other functions

        parameters and arguments

        returnType functionName(dataType parameterName, ...) {
            ...
        }

ex:     public double getDiscountPrice(int price, int percent) {
            return price * percent / 100.0;
        }

        parameters vs arguments

ex:     public double getTenPercentOffDiscountPrice(int price) {
            return price * 0.9;
        }

        getTenPercentOffDiscountPrice(20000);

        - int price is a parameter
        - 20000 is an argument

        return values

        returnType functionName(dataType parameterName, ...) {
            ...
            return valueWithReturnType;
        }

        - when using func to return value, return type must match with data type of value returned
        - can be primitive, or object

        void functionName(dataType parameterName, ...) {
           ...
        }

ex:     void sayGoodMorning() {
            System.out.println("Good morning!");
        }

        overloading

        returnType sameFunctionName(dataType1 parameterName1) {
            ...
        }

        returnType sameFunctionName(dataType2 parameterName2) {
            ...
        }

        - with overloading, same name with different parameters are possible
        - this is useful because we can have functions that do same thing on different data types

ex:     public double getTenPercentOffDiscountPrice(int price) {
            return price * 0.9;
        }


        public double getTenPercentOffDiscountPrice(double price) {
            return price * 0.9;
        }

        getTenPercentOffDiscountPrice(200000);
        getTenPercentOffDiscountPrice(12000.75)

        - with int, can't use double or float values, need to convert them into an int
        - with double, we can use decimal numbers with the same name




        */

    }
}
