package labs;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount acc1  = new BankAccount("465239874", 1000);
        BankAccount acc2  = new BankAccount("876428591", 2000);
        BankAccount acc3  = new BankAccount("127494984", 2500);

        acc1.setName("Jim");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(600);
        acc1.payBill(1000);
        acc1.accrue();
        System.out.println(acc1.toString());
    }
}

class BankAccount implements IInterest {
    // Properties of BankAccount
    private static int iD = 1000;
    private String accountNumber;   // iD = ran 2 dig num + first 2 of ssn
    private static final String routingNumber = "005400657"; // static means it's not unique to each object, rather common along all objects
    // if we want routingNumber to not change, use final
    private String name;
    private String SSN;
    private double balance;

    // Constructor
    public BankAccount(String SSN, double initDeposit) {
        balance = initDeposit;
        this.SSN = SSN;
        iD++;
        setAccountNumber();
    }

    private void setAccountNumber() {
        int random = (int) (Math.random() * 10);
        accountNumber = iD + "" + random + SSN.substring(0, 2);
        System.out.println("Your Account Number: " + accountNumber);
    }

    // methods

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void payBill(double amount) {
        balance = balance - amount;
        System.out.println("Paying bill: " + amount);
        showBalance();
    }

    public void makeDeposit (double amount) {
        balance = balance + amount;
        System.out.println("Making Deposit: " + amount);
        showBalance();
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        showBalance();
    }

    @Override
    public String toString() {
        return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance " +  balance + "]";
    }
}