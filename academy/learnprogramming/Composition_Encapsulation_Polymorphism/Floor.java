package academy.learnprogramming.Composition_Encapsulation_Polymorphism;

public class Floor {

    private double length;
    private double width;

    public Floor(double length, double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    private double getArea(double length, double width) {
        return width * length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
