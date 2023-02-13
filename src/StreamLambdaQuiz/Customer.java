package StreamLambdaQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {

    public static void main(String args[]) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("101", "Victor", "Y"));
        accounts.add(new Account("102", "Rick", "Y"));
        accounts.add(new Account("103", "Sam", "Y"));
        accounts.add(new Account("104", "John", "Y"));
        accounts.add(new Account("105", "Grover", "N"));
        accounts.add(new Account("106", "Adam", "N"));
        accounts.add(new Account("107", "Samy", "N"));
        accounts.add(new Account("108", "Duke", "N"));

//        System.out.println(getStatus(accounts));
        accounts.stream().filter(x -> "Y".equalsIgnoreCase(((Account) x).getStatus())).collect(Collectors.toList()).forEach(System.out::println);

    }


}
