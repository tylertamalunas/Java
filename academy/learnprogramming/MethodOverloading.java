package academy.learnprogramming;

public class MethodOverloading {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >= 0 && inches >=0) {
            double feetToInches = feet * 12;
            inches = feetToInches + inches;
            return inches * 2.54;
        }
        return -1;
        }
    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches >= 0) {
            return inches / 12;
        }
        return -1;
    }
}
