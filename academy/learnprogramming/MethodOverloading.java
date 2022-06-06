package academy.learnprogramming;

public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calulateScore("Tyler", 500);
        System.out.println("New score is " + newScore);
        calulateScore(75);
        calulateScore();

    }
    public static int calulateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calulateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calulateScore() {
        System.out.println("No player name, no score.");
        return 0;
    }

}
