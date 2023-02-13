package Inheritance;

public class Vehicle {

    public Vehicle(String name, String model) {
        this.name = name;
        Model = model;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    private String name;
    private String Model;
    private int currentDirection;
    private int currentVelocity;


    public void Steer (int currentDirection){
    this.currentDirection+=currentDirection;

        System.out.println("Vehicle.steer : in direaction "+ currentDirection );
    }

    public void Moving(int velocity, int direction){
        currentDirection=direction;
        currentVelocity= velocity;
        System.out.println("Vehicle.Moving current velocity  "+ currentVelocity + " direction of "+ currentDirection +" Degree");

    }

    public void Stop(){
        this.currentVelocity = 0;
        System.out.println("Current Velocity "+ this.currentVelocity);
    }







}
