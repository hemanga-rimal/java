package basics;

public class weather {
     static void main(String[]args) {
        // this program will give suggestions of what to wear based on the basics.weather (temperature and sun condition)

        int temperature = 45;
        String sunCondition = "sunny";

        if (temperature > 80) {
            System.out.println("it's pleasant, wear shorts and a t-shirt");
        }
        else if ((temperature > 60) && (sunCondition == "sunny")) {
            System.out.println("it's a little cooler, perhaps wear a long sleeve shirt and jeans");
            System.out.println("wear a hat to block out the sun");
        }
        else if ((temperature > 50) || (sunCondition == "overcast")) {
            System.out.println("this is a cooler day, make sure to wear warmer clothes");
        }
        else {
            System.out.println("it's a cold day, bring a sweater");
        }

        System.out.println("the program is ending");

    }


}
