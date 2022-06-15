package com.beginner.firstjavacode;

public class MyFirstJavaApp {
    // first created a class


    public static void main(String[] args) {
        // then added main method
        byte numberSeats = 5;
        byte numberDoors = 5;
        byte numberOwners = 1;
        byte emissionSticker = 4;

        short power = 270;
        short horsePower = 390;
        short co2Emission = 250;
        short cubicCapacity = 6000;

        int price = 65000;
        int mileage = 4000;

        long registrationNumber = 6325812376354902L;

        float totalFuelConsumption = 18.5F;
        float urbanFuelConsumption = 23.5F;
        float suburbanFuelConsumption = 11.5F;

        double fuelConsumptionPreciseAverage = 15.23442345432341;

        boolean isDamaged = false;

        char energyEfficiencyCategory = 'G';

        System.out.println("1996 Toyota Supra");
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + "km");
        System.out.println("The car is Damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + power + "kW(" + horsePower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + "g/km");
        System.out.println("Emission sticker: " + emissionSticker + " ( Energy efficiency category: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + totalFuelConsumption + " l/100km");
        System.out.println("Urban fuel consumption: " + urbanFuelConsumption + " l/100km");
        System.out.println("Suburban fuel consumption: " + suburbanFuelConsumption + " l/100km");
        System.out.println("Precise fuel consumption: " + fuelConsumptionPreciseAverage + " l/100km");
        System.out.println("Number of previous owners: " + numberOwners);
        System.out.println("Number of doors: " + numberDoors);
        System.out.println("Number of seats: " + numberSeats);

        System.out.println("Conversion");
        short newNumberSeats = numberSeats;
        System.out.println("The values of new number of seats: " + newNumberSeats);
        double newTotalFuelConsumption = totalFuelConsumption;
        System.out.println("The new value of total fuel consumption: " + newTotalFuelConsumption + "l/100km");

        byte newPower = (byte) power;
        System.out.println("The value of the new power: " + newPower + "kW");


    }
}

/* public - access modifier; defines how other parts of the code can
            use the code under main
 */
// class - is used to define a class
// methods - used to group connected operations to one another
/* static - shows that method belongs to the class, rather than an object
            created in the class
 */
// void - main method doesn't return anything; simply runs action
// main - name of function
// system - inbuilt class of java; represents comp sys
// out - a field, attribute in a system responsible for outputs
// println - function of out; prints single line
// variables - piece of memory segment used to store info

// how to declare variable - dataType variableName;
// how to define - (dataType) variableName = value;

// object ref:
// whole numbers - Byte, Short, Integer, Long
// floating point - Float, Double
// two state; t/f - Boolean
// text types - Character, Strong
// built-in/custom - FileWriter, BlueWhale, ATMMachine

// variables - naming convention:
// case sensitive
// can't be declared twice w/ same name
// must start w/ letter, $, or _
// can also contain numbers
// can't be equal to reserved keywords

// variables - naming standards
// camelCase - first word lowercase; next ones uppercase
// should describe what variable contains
// don't use abbreviations
// don't reuse variable
// don't use $ or _ or numbers

// 4 types of primitives:
// whole numbers, floating point numbers, boolean, character
/* whole numbers - byte (-128-127), short (-32,768-32,767),
                   int (-2,147,483,648-2,147,483,647)
                   long (-9,223,372,036,854,775,808-9,223,372,036,854,775,807)
 */

// data types - primitives:
// float, 6-7 decimal digits
// double, 15 decimal digits
// boolean - true or false
// char - single character or ASCII value

// data types - primitives - conversion
// two types - widening and narrowing
// explicit conversion (narrowing) - desiredDataType newVariableName = (desiredDataType) value of otherVariableName

// task - primitives
// choose a website/game/app
// create a list of possible variables and what types you'd use to store them
// print them out with system that allows println
// share it

// ---------------------------------------------------------------------------------------------------------------------

// object - an instance of a class
// reference - points to a memory location

// how to create object:
// ClassName objectName = value OR new ClassName();
/* ex: DodgeChallenger redDodgeChallenger = new DodgeChallenger("red");
  DodgeChallenger greenDodgeChallenger = new DodgeChallenger("green");
*/
// you can create functions from objects, which can return certain attributes of that object
// object.function();

// built in object references:
// Byte, Short, Integer, Long, Float, Double, Boolean, Character, String
// ex of string usage:
// toUpperCase(); toLowerCase(); equals(); isEmpty(); isBlank();



