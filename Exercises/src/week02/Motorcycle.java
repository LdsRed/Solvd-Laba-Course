package week02;

import java.util.Objects;

public class Motorcycle extends Vehicle{
    private String type;
    private int engineCapacity;

    public Motorcycle(String brand, String model, int year, double price, String color, String type, int engineCapacity) {
        super(brand, model, year, price, color);
        this.type = type;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void startVehicle() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is riding.");

    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, price, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Motorcycle motorcycle = (Motorcycle) obj;
        return Objects.equals(type, motorcycle.type);
    }

    @Override
    public void move() {

    }
}
