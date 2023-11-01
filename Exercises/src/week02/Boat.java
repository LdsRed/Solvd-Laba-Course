package week02;

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
}