package academy.learnprogramming.challenges;

public class FactorPrinter {
    public static void main(String[] args) {
printFactors(-1);
    }

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int factor = 1;
        while (factor <= number) {
            if (number % factor == 0) {
                String x = String.valueOf(factor);
                System.out.println(x);
            }
            factor++;
        }
    }
}