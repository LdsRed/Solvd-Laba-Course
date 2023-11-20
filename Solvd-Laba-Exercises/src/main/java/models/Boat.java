package models;

public class Boat extends Vehicle{
    private double maxSpeed;

    public Boat(String brand, String model, int year, double price,String color, double maxSpeed) {
        super(brand, model, year, price, color);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startVehicle() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void move() {

    }
}
