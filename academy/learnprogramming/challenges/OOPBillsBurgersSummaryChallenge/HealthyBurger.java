package academy.learnprogramming.challenges.OOPBillsBurgersSummaryChallenge;

public class HealthyBurger extends Hamburger{

    private double healthyExtra1Price;
    private double healthyExtra2Price;
    private String healthyExtra1Name;
    private String healthyExtra2Name;

    public HealthyBurger(String meat,double price) {
        super("Healthy", meat, price, "Brown");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        if (price < 0) {
            this.healthyExtra1Price = 0;
        } else {
            this.healthyExtra1Price = price;
        }
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        if (price < 0) {
            this.healthyExtra2Price = 0;
        } else {
            this.healthyExtra2Price = price;
        }
    }

    @Override
    public double itemizeHamburger() {
        double burgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return healthyExtra1Price + healthyExtra2Price + burgerPrice;
    }
}
