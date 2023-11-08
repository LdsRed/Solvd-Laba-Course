package week02;

public class Garage {
    private static int numberOfVehicles = 0;

    public static void addVehicle() {
        numberOfVehicles++;
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }
}