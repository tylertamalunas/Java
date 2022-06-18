package academy.learnprogramming.Composition_Encapsulation_Polymorphism;

public class Walls {

    private int height;
    private int length;
    private String color;

    public Walls(int height, int length, String color) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
        this.color = color;
    }

    private double getArea(int height, int length) {
        return height * length;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
