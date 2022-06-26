package academy.learnprogramming.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array size: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[number];
        System.out.println("Please enter the elements in the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
