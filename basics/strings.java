package basics;

public class strings {
    public static void main(String[] args) {
        String bookTitle;
        String wordChoice = "ring";
        bookTitle = "the lord of the rings";

        if (bookTitle.contains(wordChoice)) {
            System.out.println("this book contains the word " + wordChoice);
        }

        String browser = "chrome";
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("the browser is chrome");
        }

        String firstName = "hemanga";
        String lastName = "rimal";
        String SSN = "2783649823";

        System.out.println("there are " + SSN.length() + " digits in the SSN" );

        // print the initials plus last 4 digits of SSN
        System.out.println(firstName.substring(0, 1));
        System.out.println(lastName.substring(0, 1));
        System.out.println(SSN.substring(5));

    }
}
