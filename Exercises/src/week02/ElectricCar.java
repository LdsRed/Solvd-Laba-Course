package week02;

import week02.interfaces.Electric;
import week02.interfaces.SelfDriving;

public class ElectricCar extends Car implements Electric, SelfDriving {

    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, double price, String color, int numberOfDoors, int numberPassangers, int batteryCapacity) {
        super(brand, model, year, price, color, numberPassangers);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void charge() {
        System.out.println(brand + " is charging correctly!");
    }

    @Override
    public void enableSelfDriving() {
        System.out.println(brand + " has enable self-driving mode for 50 mins.");
    }

    @Override
    public void move() {

        System.out.println(brand + " moves sweet as a tesla");
    }
}
