package labs;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.Locale;

public class Lab2 {
    public static void main(String[] args) {
        Student s1 = new Student("Joe", "193720475");
        Student s2 = new Student("Thomas", "926497402");
        Student s3 = new Student("Sean", "825493648");

        s1.enroll("Math151");
        s1.enroll("Phys121");
        s1.enroll("Cmpt251");

        //s1.showCourses();
        //s1.checkBalance();
        s1.payTuition(600);
        //s1.checkBalance();

        System.out.println(s1.toString());

    }
}

class Student {
    private static int iD = 100;
    private String userId;
    private String name;
    private String ssn;
    private String phone;
    private String city;
    private String state;
    private String email;
    private String courses = "";
    private static final int costOfCourse = 200;
    private int balance = 0;

    public Student(String name, String ssn) {
        iD++;
        this.name = name;
        this.ssn = ssn;
        setuserId();
        setEmail();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    private void setEmail() {
        email = name.toLowerCase() + "." + iD + "@gmail.com";
        System.out.println("Your Email: " + email);
    }
    public String getEmail() {
        return email;
    }

    private void setuserId() {
        int max = 90;
        int min = 10;
        int randNum = (int) (Math.random() * (max - min));
        randNum = randNum + min;
        userId = iD + "" + randNum + ssn.substring(7);
        System.out.println("Your User ID: " + userId);
    }

    public void enroll(String course) {
        this.courses = courses + "\n" + course;
        balance = balance + costOfCourse;
    }

    public void payTuition(int amount) {
        System.out.println("Payment: " + amount);
        balance = balance - amount;
    }

    public void showCourses() {
        System.out.println(courses);
    }

    public void checkBalance() {
        System.out.println("Balance: $" + balance);
    }

    public String toString() {
        return "[NAME: " + name + " ]\n[COURSES: " + courses + " ]\nBALANCE: " + balance + " ]";
    }
}
