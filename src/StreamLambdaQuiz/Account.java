package StreamLambdaQuiz;

public class Account {
    private String accountNo;
    private String accountName;
    private String status;


    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", accountName='" + accountName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


    public Account(String accountNo, String accountName, String status) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.status = status;
    }

    public Account() {
    }

    ;
}
