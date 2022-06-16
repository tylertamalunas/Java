package academy.learnprogramming.challenges;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // constructor 1
    public VipCustomer() {
        this("Tyler", 800000, "tamas@gmail");
    }

    // constructor 2
    public VipCustomer(String name, String email) {
        this(name, 200000, email);
    }

    // constructor 3
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
