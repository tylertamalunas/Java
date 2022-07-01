package academy.learnprogramming.Loops;

import java.util.ArrayList;

public class ForEach {

    public static void main(String[] args) {

        String[] cars = {"R1T", "R1S", "Audi R8"};

        // for each car in cars array, print out what the car is starting from [0]
        //until you get to the last entry in the array
        for (String car : cars) {
            System.out.println(car);
        }

        //iterators
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(23);

        // for each item in the arraylist numbers
        for (int a : numbers) {
            System.out.println(a);
        }
    }
}
