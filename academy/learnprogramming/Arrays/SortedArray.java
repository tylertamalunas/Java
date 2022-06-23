package academy.learnprogramming.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers(5)));



    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + size + " numbers to be used:");
        int[] values = new int[size];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = unsortedArray;
        for (int i = 0; i < unsortedArray.length; i++) {
            if (unsortedArray[i] < sortedArray[i+1]) {
                sortedArray[i] = unsortedArray[i];
            }
        }
        Arrays.sort(unsortedArray, Collections.reverseOrder());

        return sortedArray;
    }
}
