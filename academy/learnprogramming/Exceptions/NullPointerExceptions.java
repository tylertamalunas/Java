package academy.learnprogramming.Exceptions;

import java.util.Scanner;

public class NullPointerExceptions {

    public static void main(String[] args) {

//        String a = null;
//        System.out.println(a.length());

        // int i = null;  cant assign null to primitives

        Scanner scan = null;
        scan.nextInt();
    }
}
