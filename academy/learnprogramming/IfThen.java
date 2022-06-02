package academy.learnprogramming;

public class IfThen {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an Alien!");
            System.out.println("and Im scared of them.");
        }
        int topScore = 90;
        if (topScore == 100) {
            System.out.println("You got the top score!");
        }
        int secTopScore = 89;
        if ((topScore > secTopScore && topScore < 100)) {
            System.out.println("greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secTopScore <= 90)) {
            System.out.println("either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is not an error");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("thats not a car");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");

        }
    }
}
