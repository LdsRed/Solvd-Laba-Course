package models;

public class Bicycle extends Vehicle{
    private int numberOfGears;

    public Bicycle(String brand, String model, int year, double price, String color, int numberOfGears) {
        super(brand, model, year, price, color);
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
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
