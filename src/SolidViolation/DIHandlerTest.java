package SolidViolation;

public class DIHandlerTest {

 private  IErrorlogger errorLogger;
    public  DIHandlerTest(IErrorlogger iErrorlogger) {
        this.errorLogger=iErrorlogger;

    }


    void CreatePost(Database db, String postMessage) {
        try {
            db.Add(postMessage);
        } catch (Exception ex) {
            errorLogger.log(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        DIHandlerTest fix = new DIHandlerTest(new ErrorLogger());
        fix.CreatePost(new Database(), "Post");
    }
}
