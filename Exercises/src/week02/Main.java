package week02;

import week02.exceptions.ChargingException;
import week02.exceptions.GarageException;
import week02.exceptions.SelfDrivingException;
import week02.interfaces.Loadable;
import week02.interfaces.SelfDriving;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {


        try {
             Vehicle sportCar = new SportCar("Ferrari");
             Vehicle truck = new Truck("Mercedes");
             ElectricCar electriCar = new ElectricCar("Tito");

             //Let's simulate some exceptions
             //Charging Exception
            try{
                throw new ChargingException("Charging Failed.");
            } catch (ChargingException e) {
                logger.log(Level.SEVERE, "Charging exception", e);
                System.err.println("Charging exception: " + e.getMessage());
            }

            sportCar.startVehicle();
            sportCar.move();


            truck.startVehicle();
            truck.move();
            ((Loadable) truck).loadCargo();


            //Lest simulate a selfdriving exception
            try{
                throw new SelfDrivingException("Self-driving mode error.");
            } catch (SelfDrivingException e) {
                logger.log(Level.SEVERE, "Self-driving exception", e);
                System.err.println("Self-driving exception: " + e.getMessage());
            }



            electriCar.startVehicle();
            electriCar.move();
            electriCar.charge();

            //Lets simulate a garage exception

            try {
                throw new GarageException("Error in the garage.");
            } catch (GarageException e) {
                logger.log(Level.SEVERE, "Garage exception", e);
                System.err.println("Garage exception" + e.getMessage());
            }

            electriCar.enableSelfDriving();
            Garage.addVehicle();
            Garage.addVehicle();

            System.out.println("Total vehicle in the garage: " + Garage.getNumberOfVehicles());
            

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Unhandled exception", e);
            e.printStackTrace();
        }

    }


}
