package week02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import week02.interfaces.Electric;
import week02.interfaces.SelfDriving;

public class ElectricCar extends Car implements Electric, SelfDriving {
    private static final Logger logger = LogManager.getLogger(ElectricCar.class);
    private int batteryCapacity;

    public ElectricCar(String brand){
        super(brand);
    }
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
        logger.info(brand + " is charging correctly!");
    }

    @Override
    public void enableSelfDriving() {
        logger.info(brand + " has enable self-driving mode for 50 mins.");
    }

    @Override
    public void move() {

        logger.info(brand + " moves sweet as a tesla");
    }
}
