package academy.learnprogramming.challenges;

public class OperatorChallenge {

    public static void main(String[] args) {

        double firstDouble = 20.00d;
        double secDouble = 80.00d;
        double doubleTotal = ((firstDouble + secDouble) * 100.00d);
        double doubleRemainder = doubleTotal % 40.00d;
        boolean isZero = (doubleRemainder == 0) ? true : false;
        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some remainder.");
        }
    }
}
