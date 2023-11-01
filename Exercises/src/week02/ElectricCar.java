package week02;

public class ElectricCar extends Car{

    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, double price, String color, int numberOfDoors, int numberPassangers, int batteryCapacity) {
        super(brand, model, year, price, color,numberOfDoors, numberPassangers);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
