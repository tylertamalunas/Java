package academy.learnprogramming;

public class TeenNumberChecker {

    public static boolean hasTeen(int firstInt, int secInt, int thirdInt) {

        return ((firstInt >= 13 && firstInt <= 19) || (secInt >= 13 && secInt <= 19) || (thirdInt >= 13 && thirdInt <= 19));
    }
}
