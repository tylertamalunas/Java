package academy.learnprogramming.challenges;

public class PrimitiveTypesChallenge {

    public static void main(String[] args)

    {

        byte firstByteValue = 10;
        short firstShortValue = 10000;
        int firstIntValue = 2000000;

        long firstLongValue = (50000L + (10L * (firstByteValue + firstShortValue + firstIntValue)));

        System.out.println(firstLongValue);

        short shortTotal = (short) (1000 + 10 * (firstByteValue + firstShortValue + firstIntValue));
        System.out.println(shortTotal);
    }
}
