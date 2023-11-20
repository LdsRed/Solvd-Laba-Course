package models;

public class Bus extends Vehicle{

    private int passengerCapacity;

    public Bus(String brand, String model, int year, double price, String color,int passengerCapacity) {
        super(brand, model, year, price, color);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
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
