package academy.learnprogramming;

public class DigitSumChallenge {

    public static int sumDigits(int number) {

        // no digits under 10
        if (number >= 10) {
            int sumOfDigits = 0;

            while (number > 0) {
                // getting the last digit and adding to sum of digits
                int leastsignificantdigit = number % 10;
                sumOfDigits += leastsignificantdigit;
                // discarding the last digit
                number /= 10;
            }
            return sumOfDigits;
        }
        return -1;
    }
}
