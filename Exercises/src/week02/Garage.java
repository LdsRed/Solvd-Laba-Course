package week02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Garage {
    private static int numberOfVehicles = 0;
    private static final Logger logger = LogManager.getLogger(Garage.class);
    public static void addVehicle() {
        numberOfVehicles++;
        logger.info("Vehicle added to the garage.");
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }
}