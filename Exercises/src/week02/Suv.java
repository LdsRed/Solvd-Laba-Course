package week02;

public class Suv extends Car{
    private boolean fourWheelDrive;

    public Suv(String brand, String model, int year, double price, String color, int numberPassangers,int numberOfDoors, boolean fourWheelDrive) {
        super(brand, model, year, price, color, numberPassangers,numberOfDoors);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }


    @Override
    public String toString() {
        return "Suv{" +
                "fourWheelDrive=" + fourWheelDrive +
                '}';
    }
}
