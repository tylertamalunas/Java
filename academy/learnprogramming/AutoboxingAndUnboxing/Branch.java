package academy.learnprogramming.AutoboxingAndUnboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

//    public boolean newCustomer(String name, double transaction) {
//        //return true if customer added successful
//        if (!customers.contains(name)) {
//            customers.add(customers.get(name));
//
//            return true;
//        } else {
//            System.out.println(name + " already a customer.");
//            return false;
//        }
//    }

//    public boolean addCustomerTransaction(String name, double transaction) {
//        //true if transaction added succesfully
//        // false if failed to add
//    }
//
//    public Customer findCustomer(String name) {
//        // return customer if exists, otherwise return null
//    }
}
