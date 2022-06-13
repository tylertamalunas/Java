package academy.learnprogramming;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        int originalNumber = number;
        int digit = 0;
        int sum = 0;
        while (number >= 0) {
            digit = number % 10;
            if (number == originalNumber) {
                sum += digit;
            }
            number /= 10;
            if (number == 0) {
                sum += digit;
                return sum;
            }
        }
        return -1;
    }
}
