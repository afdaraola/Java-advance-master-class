package MobileChallenges;

import java.util.ArrayList;

public class MobilePhone {

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    private String myNumber;
    private ArrayList<Contacts> myContacts;


    public boolean addNewContact(Contacts contacts){
        if(findContact(contacts.getName())>=0){
            System.out.println(contacts.getName() + "Already exists");
            return false;
        }else{
            myContacts.add(contacts);
            return true;
        }
    }


    public boolean updateContact(Contacts oldContact, Contacts newContact){
         int position =    findContact(oldContact);

         if(position < 0) {
             System.out.println(oldContact.getName()+" Customer not found");
             return false;
         }else if(position!=-1){
             System.out.println(oldContact.getName() + "Already Exists ");
             return false;
         }
             myContacts.set(position, newContact);
        System.out.println(oldContact.getName()+ " Updated sucessfully");
         return true;
    }



    public boolean removeContact(Contacts contacts){
        int position =   findContact(contacts);

        if(position>=0){
            this.myContacts.remove(position);
            System.out.println(contacts.getName() +"Contact Remove");
            return true;
        }else{
            System.out.println(contacts.getName()+ "Does not exists");
            return false;
        }
    }

    public int findContact(String name){
        for (int i = 0; i < myContacts.size(); i++){
            Contacts contacts = this.myContacts.get(i);
            if(contacts.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }




public String queryContact(Contacts contacts ){
   if(findContact(contacts)>0){
       return contacts.getName();
   }else {
       return null;
   }
}

    public Contacts queryContact(String name ){

        int position = findContact(name);

        if(position >= 0){
            return this.myContacts.get(position);
        }

        return null;

    }



    public void printContact() {
        System.out.println("Contact List");
        System.out.println("this.myContacts.size() = "+this.myContacts.size());
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber() );
        }

    }



}
