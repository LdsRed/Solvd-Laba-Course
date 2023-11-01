package week02;

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
}
