package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car audi = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
