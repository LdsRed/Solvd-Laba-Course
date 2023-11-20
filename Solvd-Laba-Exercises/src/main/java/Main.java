import models.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import exceptions.ChargingException;
import exceptions.GarageException;
import exceptions.SelfDrivingException;
import interfaces.Loadable;
import interfaces.SelfDriving;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);


    public static void main(String[] args) throws ChargingException, SelfDrivingException, GarageException {


        try {
            Vehicle vehicle1 = new SportCar("Ferrari");
            Vehicle vehicle2 = new Truck("Ford");
            ElectricCar vehicle3 = new ElectricCar("Tesla");

            vehicle1.startVehicle();
            vehicle1.move();

            vehicle2.startVehicle();
            vehicle2.move();
            ((Truck) vehicle2).loadCargo();

            vehicle3.startVehicle();
            vehicle3.move();
            vehicle3.charge();
            vehicle3.enableSelfDriving();

            Garage.addVehicle();
            Garage.addVehicle();

            logger.info("Total vehicles in the garage: " + Garage.getNumberOfVehicles());
        } catch (Exception e) {
            logger.error("Unexpected exception caught: " + e.getMessage());
        }

    }
}
