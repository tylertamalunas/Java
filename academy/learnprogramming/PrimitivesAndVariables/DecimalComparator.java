package academy.learnprogramming.PrimitivesAndVariables;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstInt = (int) (firstNumber * 1000);
        int secInt = (int) (secondNumber * 1000);
        if (firstInt == secInt) {
            return true;
        }else {
            return false;
        }
    }
}
