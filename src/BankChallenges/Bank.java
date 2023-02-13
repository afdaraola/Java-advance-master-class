package BankChallenges;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch> ();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }


    public boolean addBranch(String name){
        Branch newBranch = findBranch(name);
        if(newBranch==null){
         this.branches.add(new Branch(name));
         return true;
        }
       return false;
    }

    public  boolean addCustomer( String brnName, String customerName, double amount){
        Branch custExist = findBranch(brnName);
        System.out.println(custExist);
        if(custExist != null){
           return  custExist.newCustomer(customerName,amount);
        }else{
            return  false;
        }

    }



    public boolean addCustomerTransaction(String customerName, String branchName, double transactionAmt){
        Branch brnExist = findBranch(branchName);
        if(brnExist != null){
            brnExist.newCustomer(customerName,transactionAmt);
            return true;
        }
      return  false;
    }


    public boolean listCustomers(String name , boolean printTransaction) {
        Branch branchExists = findBranch(name);

        if (branchExists != null) {
            System.out.println("Branch Exists" + branchExists.getName());

            ArrayList<Customer> branchCustomers = branchExists.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + branchCustomer.getName() + "[" + (i + 1) + "]");

                if (printTransaction) {
                    System.out.println("Transaction ");
                    ArrayList<Double> customerTransaction = branchCustomer.getTransactions();
                    for (int j = 0;  j < customerTransaction.size(); j ++){
                        System.out.println("["+ (j+1)+ "] Amount "+ customerTransaction.get(j));
                    }

                }
                return true;
            }

        }
        return false;
    }


    private Branch findBranch(String branchName) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }

        return null;
    }
}
