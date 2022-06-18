package academy.learnprogramming.Composition_Encapsulation_Polymorphism;

public class Table {

    private String material;

    public Table(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void flip() {
        System.out.println("The table is now upside down.");
    }
}
