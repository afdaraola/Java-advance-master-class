package AmazonCoding;

public class BankAccounnt {
    public static void main(String[] args) {
        BankAccounnt festusAccount = new BankAccounnt();

        festusAccount.depositFund(100);
        festusAccount.withdrawalFund(200);
    }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getCustomerNname() {
            return customerName;
        }

        public void setCustomerNname(String customerNname) {
            this.customerName = customerNname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        private String accountNumber;
        private double balance;
        private String customerName;
        private String email;
        private String phoneNumber;

        public  void depositFund(double amount){

                this.balance+= amount;


            System.out.println(balance);
        }

        public void withdrawalFund(double amount){
            if(this.balance - amount < 0){
                System.out.println("Insufficient Balance");
            }else{
                balance-= amount;
            }

            System.out.println(balance);
        }
    }



