package MailCustomer;

public class Gmail implements ExchangeSmtp {

    @Override
    public void sendEmail() {
        System.out.println("Gmail");
    }
}

