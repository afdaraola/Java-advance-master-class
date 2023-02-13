package AmazonCoding;

public class VipCustomer {
    public static void main(String[] args) {
        VipCustomer person = new VipCustomer();
        System.out.println(person.getName());

        VipCustomer person1 = new VipCustomer("Ademola","Festus@gmail.com");
        System.out.println(person1.getCreditLimit());

        VipCustomer person2 = new VipCustomer("Daramola", 25.00, "demola@gamil.com");
        System.out.println(person2.getName());

    }

    private String name;
    private Double creditLimit;
    private String customerEmailAddress;

    public VipCustomer(){
        this("Festus",0.00,"festus@gmail.com");
    }

     public VipCustomer(String name, String customerEmailAddress){
        this(name, 0.00, customerEmailAddress);
     }

    public VipCustomer(String name, Double creditLimit, String customerEmailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }


}
