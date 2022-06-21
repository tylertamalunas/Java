package academy.learnprogramming.challenges.OOPBillsBurgersSummaryChallenge;

public class Hamburger {

    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        if (price < 0) {
            this.price = 0;
        }else {
            this.price = price;
        }
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        if (price < 0) {
            this.addition1Price = 0;
        }else {
            this.addition1Price = price;
        }
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        if (price < 0) {
            this.addition2Price = 0;
        }else {
            this.addition2Price = price;
        }
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        if (price < 0) {
            this.addition3Price = 0;
        }else {
            this.addition3Price = price;
        }
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        if (price < 0) {
            this.addition4Price = 0;
        }else {
            this.addition4Price = price;
        }
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
        if (this.addition1Name != null) {
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
    }
}
