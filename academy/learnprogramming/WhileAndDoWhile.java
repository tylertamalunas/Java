package academy.learnprogramming;

public class WhileAndDoWhile {

    public static void main(String[] args) {

        isEvenNumber(5);
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        count =1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;


//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);

    }
    public static boolean isEvenNumber(int number) {

        while (number % 2 != 0) {
            System.out.println(number + " is odd");
            number++;
        }
        System.out.println(number + " is even");
        return true;
    }
}

