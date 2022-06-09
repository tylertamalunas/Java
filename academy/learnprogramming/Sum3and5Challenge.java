package academy.learnprogramming;

public class Sum3and5Challenge {

    public static void main(String[] args) {

        int count = 0;
        int sumOfNumbers = 0;

        for (int i = 1; i < 1001; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sumOfNumbers += i;
                count++;
                System.out.println("Number " + i + " is divisible by both 5 and 3");
                if (count == 5) {
                    System.out.println(sumOfNumbers);
                    break;
                }
            }
        }
    }
}
