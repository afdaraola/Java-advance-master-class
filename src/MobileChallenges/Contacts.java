package MobileChallenges;


import java.util.ConcurrentModificationException;

public class Contacts {

    private String phoneNumber;
    private String name;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static Contacts CreateContact (String name , String phoneNumber){

         return new Contacts(name,phoneNumber);

    }



}
