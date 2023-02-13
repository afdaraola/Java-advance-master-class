package BankChallenges;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name,double initialAmount){
        Customer foundCustomer = findCustomer(name);
        if(foundCustomer == null) {
            this.customers.add(new Customer(name,initialAmount));
            return true;
        }
        return false;
    }


    public boolean addCustomerTransaction(String name, double transactionAmount){
        Customer customerExisting = findCustomer(name);
        if(customerExisting != null){
            customerExisting.addTransactions(transactionAmount);
           return true;
        }
        return false;
    }


    private Customer findCustomer(String name){
        for (int i =0; i < this.customers.size(); i ++){
            Customer customerExist = this.customers.get(i);
            if(customerExist.getName().equals(name)){
                return customerExist;
            }
        }
        return null;
    }

}
