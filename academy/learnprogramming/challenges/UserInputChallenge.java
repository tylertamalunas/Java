package academy.learnprogramming.challenges;

import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Please enter #" + count + ": ");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }
        System.out.println("The sum of those 10 numbers is " + sum);

        scanner.close();
    }
}
