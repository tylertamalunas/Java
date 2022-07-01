package academy.learnprogramming.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UncheckedExceptions {
    public static void main(String[] args) {

//        readFile("myFile.txt");
        String name = null;
        printLength(name);
    }
//
//    private static void readFile(String fileName) {
//        try {
//            FileReader reader = new FileReader(fileName);
//        }
//        catch (FileNotFoundException fnfe) {
//        }
//    }

    public static void printLength (String myString) {
        try {
            System.out.println(myString.length());
        }
        catch (NullPointerException npe) {
            System.out.println("String cannot be null");
        }
    }

}
