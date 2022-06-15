package oop;

class Person {

    String name;
    String email;
    String phone;

    void walk() {
        System.out.println(name + " is walking");

    }

    void eat() {
        System.out.println(email);

    }

    void sleep() {
        System.out.println(name + " is sleeping");

    }
}

public class Demo {
    public static void main(String[] args) {
        // instantiating an object
        Person person1 = new Person();

        // define properties
        person1.name = "joe";
        person1.email = "joe@testemail.com";
        person1.phone = "8649871326";

        // abstraction
        person1.walk();

        Person person2 = new Person();
        person2.name = "sarah";
        person2.email = "sarah@testemail.com";
        person2.phone = "3192749837";

        person2.sleep();

        /* person-

        // attributes, variables, adjectives, descriptors
        String name = "joe";
        String email = "joe@testemail.com";
        String phone = "8649871326";

        // action, activity, behavior
        // System.out.println(name + " is walking");
        walking(name);
        System.out.println(name + " is eating");

        // what if we wanted to do this for another person
        String name2 = "sarah";
        String email2 = "sarah@testemail.com";
        String phone2 = "3192749837";

        // action, activity, behavior
        // System.out.println(name2 + " is walking");
        walking(name2);
        System.out.println(name2 + " is eating");

        // what about binding attributes and properties together
    }
    // enhance by adding functions to minimize code
    static void walking(String name) {
        System.out.println(name + "  is walking");

         */
    }

}
