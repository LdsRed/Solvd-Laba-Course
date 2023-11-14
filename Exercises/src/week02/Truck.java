package week02;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import week02.interfaces.Loadable;

import java.util.Objects;
public class Truck extends Vehicle implements Loadable {


    private static final Logger logger = LogManager.getLogger(Truck.class);
    private int loadCapacity;
    private boolean trailer;

    public Truck(String brand){
        super(brand);
    }
    public Truck(String brand, String model, int year, double price, String color, int loadCapacity, boolean trailer) {
        super(brand, model, year, price, color);
        this.loadCapacity = loadCapacity;
        this.trailer = trailer;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    @Override
    public void startVehicle() {
        logger.info("Truck started.");
    }

    @Override
    public void drive() {
        logger.info("Truck is moving cargo.");
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, price, loadCapacity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Truck truck = (Truck) obj;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public void loadCargo() {
        logger.info(this.brand + " is loading cargo.");
    }

    @Override
    public void move() {
        logger.info(this.brand + " is moving slowly");
    }
}
