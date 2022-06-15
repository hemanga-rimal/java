package com.beginner.operators;

public class OperatorsApp {

    public static void main(String[] args) {


        String carModel = "1996 Toyota Supra";
        int price = 65000;
        int moneyInBank = 200000;
        boolean isDamaged = true;

        System.out.println("Price of a " + carModel + ": $" + price);

        int increasedPrice = price + 2000;
        System.out.println("The increased price of a " + carModel + ": $" + price);

        int decreasedPrice = price - 2000;
        System.out.println("The decreased price of a " + carModel + ": $" + price);

        int twoCarsPrice = price * 2;
        System.out.println("Two " + carModel + ": $" + twoCarsPrice);

        int toyotasCanBuy = moneyInBank / price;
        System.out.println("From money in bank, we can buy " + carModel + ": $" + toyotasCanBuy + " " + carModel);

        int moneyRemaining = moneyInBank % price;
        System.out.println("Money remainder after purchasing " + toyotasCanBuy + " " + carModel + ": $" + moneyRemaining);
        System.out.println();

        int priceNegative = - 65000;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign: $" + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with plus sign: $" + priceNegativeWithMinusSign);
        int oneDollarIncrease = ++price;
        System.out.println("Price after one dollar increase: $" + oneDollarIncrease);
        int oneDollarDecrease = --price;
        System.out.println("Price after one dollar decrease: $" + oneDollarDecrease);
        System.out.println("This car is damaged: " + !isDamaged);
        System.out.println();

        System.out.println("Car's price equals money in bank: " + (price == moneyInBank));
        System.out.println("Car's price doesn't equal money in bank: " + (price != moneyInBank));
        System.out.println("Car's price greater than money in bank: " + (price > moneyInBank));
        System.out.println("Car's price lesser than money in bank: " + (price < moneyInBank));
        System.out.println("Car's price greater than or equals money in bank: " + (price >= moneyInBank));
        System.out.println("Car's price lesser than or equals money in bank: " + (price <= moneyInBank));
        System.out.println("The carModel variable's datatype is string: " + (carModel instanceof  String));
        System.out.println();

        String damagedText = isDamaged ? "The car is damaged" : "The car isn't damaged";
        System.out.println(damagedText);
        System.out.println();

        String worthSeeingText = !isDamaged || price <= 20000 ? "It's worth seeing" : "It's not worth seeing";
        System.out.println(worthSeeingText);
        String worthRepairingText = isDamaged && price <= 10000 ? "It's worth repairing" : "It's not worth repairing";
        System.out.println(worthRepairingText);

        price += 1000;
        System.out.println("Price increased: $" + price);
        price -= 2000;
        System.out.println("Price decreased: $" + price);
        price *= 2;
        System.out.println("Price multiplied: $" + price);
        //price /= 2;
        //System.out.println("Price divided: $" + price);
        price %= 10000;
        System.out.println("Price remaining: $" + price);



    }
}
