package academy.learnprogramming.Arrays;

import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers(5)));
    }
    // sets array size, and asks user for values of array
    public static Integer[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " numbers to be used:");
        Integer[] values = new Integer[size];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    // prints each array value
    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value " + i + " is " + array[i]);
        }
    }

    // sorts array in descending order
    public static Integer[] sortIntegers(Integer[] unsortedArray) {
        Arrays.sort(unsortedArray, Collections.reverseOrder());
        return unsortedArray;
    }
}
