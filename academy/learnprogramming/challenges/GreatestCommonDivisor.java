package academy.learnprogramming.challenges;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        int greatestCommonDivisor = 1;
        int divisor = 1;
        while ((divisor <= first) && (divisor <= second)) {
            if (first % divisor == 0 && second % divisor == 0) {
                greatestCommonDivisor = divisor;
            }
            divisor++;
        }
        return greatestCommonDivisor;
    }
}
