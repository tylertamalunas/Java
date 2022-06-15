package academy.learnprogramming.challenges;

public class HighScore {

    public static void main(String[] args) {
        int lastScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Tyler", lastScore);

        lastScore = calculateHighScorePosition(900);
        displayHighScorePosition("Liz", lastScore);

        lastScore = calculateHighScorePosition(400);
        displayHighScorePosition("Magda", lastScore);

        lastScore = calculateHighScorePosition(50);
        displayHighScorePosition("Push", lastScore);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "
                + position + " on the high score table.");

    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
