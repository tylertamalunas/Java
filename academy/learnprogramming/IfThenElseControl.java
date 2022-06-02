package academy.learnprogramming;

public class IfThenElseControl {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        if (score < 5000) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was  " + finalScore);
        }
        score = 10000;
        levelCompleted = levelCompleted + 8;
        bonus = bonus +200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
