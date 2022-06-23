package academy.learnprogramming.Arrays;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        method 1 to make arrays
//        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
//
//
//        method 2
//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//
//
//        method 3
//        int[] myIntArray = new int[10];
//        for (int i = 0; i < myIntArray.length; i++)
//            myIntArray[i] = i * 5;


        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " typeed value was " + myIntegers[i]);;
        }
    }

    public static int[] getIntegers(int nymber) {
        System.out.println("Enter " + nymber + " integer values.\r");
        int[] values = new int[nymber];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
