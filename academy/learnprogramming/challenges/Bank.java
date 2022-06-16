package academy.learnprogramming.challenges;

public class Bank {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    // constructor
    public Bank() {
        this(1234, 2500, "name", "email", 123455667);
        System.out.println("Empty constructor called");
    }
    // constructor
    public Bank (int accountNumber, double balance, String name, String email, int phoneNumber) {
        System.out.println("Bank constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // better practice to do this and call the bigger constructor ( line 17)
    public Bank(String name, String email, int phoneNumber) {
        this(1234, 100.25,name,email,phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Nothing being deposited");
        }else {
            this.balance += depositAmount;
            System.out.println("Deposit of " + depositAmount
            + " New balance will be " + this.balance);
        }
    }
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("Withdrawal more than balance. Cancelling");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawing " + withdrawAmount
            + " New balance will be " + this.balance);
        }
    }
}
