package academy.learnprogramming.AutoboxingAndUnboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(Branch branch) {
        //return true if branch added
        if (!branches.contains(branch)) {
            System.out.println("Added branch " + branch);
            branches.add(branch);
            return true;
        } else {
            System.out.println(branch + " already exists.");
            return false;
        }
    }

    public boolean addCustomer(Branch branch, Customer customer, double transaction) {
        // return true if customer added successfully
        if (!branches.contains(customer)) {
            System.out.println("Added branch " + branch);
            return true;
        } else {
            System.out.println(branch + " already exists.");
            return false;
        }
    }

//    public boolean addCustomerTransaction(String branch, String customer, double transaction) {
//        //return true if transaction added successfully
//    }
//
//    public Branch findBranch(String branch) {
//        // return Branch if exists, otherwise null
//    }
//
//    public boolean listCustomers(String branch, boolean transactions) {
//        //return true if branch exists. print out list of customers
//    }
}
