package Inheritance;


public  class Honda extends Car {

    public Honda( String gearType) {
        super("Honda", "Civic", 4, 2014, "Manual");
        this.gearType = gearType;
    }

    private String gearType;


    public void ChangeHondaSpeed(int speed, int direction){
        super.ChangeVelocity(speed,direction);
        System.out.println("Honda.changeHondaSpeed "+ speed + "direction "+ direction +" Degree");
    }


}
