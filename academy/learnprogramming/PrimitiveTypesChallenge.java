package academy.learnprogramming;

public class PrimitiveTypesChallenge {

    public static void main(String[] args)

    {

        byte firstByteValue = 10;
        short firstShortValue = 10000;
        int firstIntValue = 2000000;

        long firstLongValue = (50000 + (10 * (firstByteValue + firstShortValue + firstIntValue)));

        System.out.println(firstLongValue);
    }
}
