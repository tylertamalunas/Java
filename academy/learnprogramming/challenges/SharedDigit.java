package academy.learnprogramming.challenges;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int number, int secondNumber) {

        if ((number <=10) || (number >= 99)) {
            return false;
        }

            int firstNumberDigit = number % 10;
            number /= 10;
            int secondNumberDigit = secondNumber % 10;
            secondNumber /= 10;
        if ((firstNumberDigit == secondNumberDigit) || firstNumberDigit == secondNumber) {
            return true;
        } else if ((number == secondNumber) || (number == secondNumberDigit)) {
            return true;
        }
        return false;
    }
}
