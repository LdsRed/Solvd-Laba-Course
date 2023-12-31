package models;

import interfaces.Movable;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Vehicle  implements Movable {

    private static final Logger logger = LogManager.getLogger(Vehicle.class);
    protected String brand;

    protected String color;
    protected String model;
    protected int year;
    protected double price;

    public Vehicle(){}

    public Vehicle(String brand){
        this.setBrand(brand);
    }

    public Vehicle(String brand, String model, int year, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    //we can use these methods for polymorphism
    public abstract void startVehicle();
    public abstract void drive();

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return year == vehicle.year &&
                Double.compare(vehicle.price, price) == 0 &&
                Objects.equals(brand, vehicle.brand) &&
                Objects.equals(model, vehicle.model);
    }

    public abstract void move();
}