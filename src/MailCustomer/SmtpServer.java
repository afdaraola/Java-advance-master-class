package MailCustomer;

public class SmtpServer {
    private ExchangeSmtp exchangeSmtp;

    public SmtpServer(ExchangeSmtp exchangeSmtp){
        this.exchangeSmtp=exchangeSmtp;

    }
    public  void executeSendMail(){
        this.exchangeSmtp.sendEmail();
    }


    public static void main(String[] args) {
        SmtpServer server = new SmtpServer(new Gmail());
         server.executeSendMail();

        server = new SmtpServer(new Outlook());
        server.executeSendMail();
    }
}
