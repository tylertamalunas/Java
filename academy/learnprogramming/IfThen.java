package academy.learnprogramming;

public class IfThen {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an Alien!");
            System.out.println("and Im scared of them.");
        }
        int topScore = 81;
        if (topScore == 100) {
            System.out.println("You got the top score!");
        }
        int secTopScore = 89;
        if (secTopScore > topScore && topScore < 100) {
            System.out.println("greater than second top scor and less than 100");
        }
    }
}
