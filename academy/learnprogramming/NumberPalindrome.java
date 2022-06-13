package academy.learnprogramming;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reverse = 0;
        while (number != 0) {
//            get the right most digit
            int lastDigit = number % 10;
            // remove last digit from number
            number /= 10;
            // move reverse digit to the left one place
            reverse *= 10;
            // add the last digit to the revers
            reverse += lastDigit;
        }
        if (reverse == originalNumber) {
            return true;
        }
        return false;
    }
}
