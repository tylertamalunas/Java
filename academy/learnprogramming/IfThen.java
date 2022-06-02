package academy.learnprogramming;

public class IfThen {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == true) {
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
    }
}
