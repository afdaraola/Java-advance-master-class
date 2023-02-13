package StreamLambdaQuiz;


import java.util.HashMap;
import java.util.Map;

public class CustomerAccount {
    private static Map<Integer, Account> Accounts;

    static {
        Accounts = new HashMap<Integer, Account>() {
            {
                put(1, new Account("1111", "Festus", "Y"));
                put(2, new Account("2222", "Ademola", "Y"));
                put(3, new Account("3333", "Abayomi", "N"));
            }


        };
    }







    }


