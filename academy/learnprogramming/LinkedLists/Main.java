package academy.learnprogramming.LinkedLists;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Tyler", 154.59);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.50);
        System.out.println("Balance for Customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intLIst = new ArrayList<Integer>();

        intLIst.add(1);
        intLIst.add(2);
        intLIst.add(3);

        for (int i = 0; i < intLIst.size(); i++)  {
            System.out.println(i + ": " + intLIst.get(i));
        }

        intLIst.add(1, 2);

        for (int i = 0; i < intLIst.size(); i++) {
            System.out.println(i + ": " + intLIst.get(i));
        }
    }
}
