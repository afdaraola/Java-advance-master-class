package MailCustomer;

public class Outlook implements ExchangeSmtp{
    @Override
    public void sendEmail() {
        System.out.println("Outlook");
    }
}
