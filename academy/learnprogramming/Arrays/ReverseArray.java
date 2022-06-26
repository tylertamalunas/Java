package academy.learnprogramming.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {
        Integer[] anArray = {4, 2, 12, 44, 9};
        reverse(anArray);
    }

    private static void reverse(Integer[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
