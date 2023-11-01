package week02;

public class Car extends Vehicle{

    private Engine engine;
    private Wheel[] wheels;
    private int numberOfDoors;
    private int numberPassengers;

    public Car(){}

    public Car(String brand, String model, int year, double price, String color,int numberOfDoors, int numberPassengers,
               Engine engine, Wheel[] wheel) {
        super(brand, model, year, price, color);
        this.numberOfDoors = numberOfDoors;
        this.numberPassengers = numberPassengers;
        this.engine = engine;
        this.wheels = wheel;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", numberPassengers=" + numberPassengers +
                '}';
    }
}
