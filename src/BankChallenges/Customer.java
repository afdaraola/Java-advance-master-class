package BankChallenges;

import java.util.ArrayList;

public class Customer {

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    private String name;
    private ArrayList<Double>  transactions;

    public Customer(String name, double initialAmount ) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(initialAmount);
    }

    public void addTransactions(double amount){
        getTransactions().add(amount);
    }


}
