package week02;

public class Truck extends Vehicle{
    private int loadCapacity;
    private boolean trailer;
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
}
