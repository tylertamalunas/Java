package academy.learnprogramming.challenges;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0L;
        int count = 0;

        while (true) {
            System.out.println("Enter a number: ");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                avg = (long) Math.round(sum / count);
            } else {
                break;
            }

        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
