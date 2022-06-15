package academy.learnprogramming.challenges;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true){
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                // sets the min and max to the first number entered
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid number");
                break;
            }

            scanner.nextLine();
        }
        System.out.println("Min: " + min + " Max: " + max);
        scanner.close();
    }
}
