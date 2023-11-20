package models;

import interfaces.Convertible;

public final class SportCar extends Vehicle implements Convertible {


    public SportCar(String brand){
        super(brand);
    }
    public SportCar(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price, color);
    }

    @Override
    public void openRoof() {
        System.out.println(this.brand + " has an open roof.");
    }

    @Override
    public void closeRoof() {
        System.out.println(this.brand + " has a closed roof.");
    }


    @Override
    public void startVehicle() {
        System.out.println(this.brand + " is starting correctly..");
    }

    @Override
    public void drive() {
        System.out.println(this.brand + " drives according to your needs.");
    }

    @Override
    public void move() {
        System.out.println(this.brand + " is moving fast! ");
    }
}
