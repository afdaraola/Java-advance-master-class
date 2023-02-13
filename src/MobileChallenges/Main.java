package MobileChallenges;


import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone("123-456-890");

    public static void main(String[] args) {
        boolean Quit = true;
        PowerOn();
        printAction();
        while(Quit){
            System.out.println("Enter Action Number , Press 6 to all option");

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Shutting Down");
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                     addNewContact();
                    break;
                case 3:
                    updateNewContact();
                    break;
                case 4:
                    removeExist();
                    break;
                case 5:
                    QueryExistingRecord();
                    break;
                case 6:
                    printAction();
            }
        }

    }


    public static void PowerOn(){
        System.out.println("Switch on the Phone");
    }

    private static void addNewContact(){
        System.out.println("Enter Name " );

        String name = scanner.nextLine();

        System.out.println("Enter phone number:  " );

        String phone = scanner.nextLine();

      Contacts isNewContact = Contacts.CreateContact(name,phone);

        if (mobilePhone.addNewContact(isNewContact)){
            System.out.println("New Contact Name "+ name + ", and Phone number "+ phone);

        }else{
            System.out.println("Contact already exists");
        }
    }

    private static void removeExist(){
        System.out.println("Enter Contact to remove");
        String oldContact = scanner.nextLine();
        Contacts existingContacts =mobilePhone.queryContact(oldContact);

        if(existingContacts == null){
            System.out.println("Record not Exist");
            return;
        }else{
            mobilePhone.removeContact(existingContacts);
            System.out.println("Record deleted");
        }
    }

        private static void QueryExistingRecord() {
            System.out.println("Enter existing contact name: ");
            String name = scanner.nextLine();
            Contacts existingContactRecord = mobilePhone.queryContact(name);
            if (existingContactRecord == null) {
                System.out.println("Contact not found.");
                return;
            }

            System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
        }


        private static void updateNewContact(){
        System.out.println("Enter Contact");
        String contactName = scanner.nextLine();
        Contacts contacts = mobilePhone.queryContact(contactName);
        if(contacts==null) {
            System.out.println("Record doesn't exists");
            return;

        }
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Phone");
        String phone = scanner.nextLine();
        Contacts contacts1 = Contacts.CreateContact(name,phone);
        if(mobilePhone.updateContact(contacts,contacts1)){
            System.out.println("Contact name is "+ contacts1.getName()+ ", Phone number "+ contacts1.getPhoneNumber());
        }else{
            System.out.println("Error update");
        }


    }

    private static void printAction(){
        System.out.println("Available number\n press ");

        System.out.println(  "0  - to shutdown\n" +
                            "1  - to print contacts\n" +
                            "2  - to add a new contact\n" +
                            "3  - to update existing an existing contact\n" +
                            "4  - to remove an existing contact\n" +
                            "5  - query if an existing contact exists\n" +
                            "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
