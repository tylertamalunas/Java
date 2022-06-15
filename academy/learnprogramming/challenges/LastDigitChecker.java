package academy.learnprogramming.challenges;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int firstNum, int secNum, int thirdNum) {

        if ( isValid(firstNum) && isValid(secNum) && isValid(thirdNum)) {
            int firstNumberLastDigit = firstNum % 10;
            int secNumberLastDigit = secNum % 10;
            int thirdNumberLastDigit = thirdNum % 10;
            if ((firstNumberLastDigit == secNumberLastDigit) || (firstNumberLastDigit == thirdNumberLastDigit) || (secNumberLastDigit == thirdNumberLastDigit)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isValid(int number) {

        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
