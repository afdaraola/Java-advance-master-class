package Inheritance;

public class Car extends Vehicle {

    public Car(String name, String model, int doors, int years, String gears) {
        super(name, model);
        this.doors = doors;
        this.years = years;
        this.gears = gears;

    }

    private int doors;
    private int years;
    private String gears;

    public void ChangeVelocity(int speed, int direction){
        super.Moving(speed,direction);
        System.out.println("Car.changevelocity() "+speed + " direction of "+ direction + " Digree");
    }



}
