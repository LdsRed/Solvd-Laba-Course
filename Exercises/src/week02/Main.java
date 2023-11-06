package week02;

import week02.interfaces.Loadable;

public class Main {

    public static void main(String[] args) {


        Wheel[] wheels = new Wheel[5];
        wheels[0] = new Wheel(16, "Yokohama", 7.5);
        wheels[1] = new Wheel(16, "Yokohama", 7.5);
        wheels[2] = new Wheel(16, "Yokohama", 7.5);
        wheels[3] = new Wheel(16, "Yokohama", 7.5);
        wheels[4] = new Wheel(16, "Yokohama", 7.5);


        Engine toyotaEngine = new Engine(1500.4, "Strong engine");
        Car car = new Car("Toyota", "Camry", 2022, 25000.0, "Black", 4, 5, toyotaEngine, wheels);

        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021, 8000.0, "Green", "Urban", 15);
        Truck truck = new Truck("Mercedes-Benz", "F-150", 2022, 35000.0,"White",2000, true);
        ElectricCar electricCar = new ElectricCar("Tesla", "Model X", 2023, 80000.0,"Red",4, 5, 100);
        Bicycle bicycle = new Bicycle("Giant", "Defy Advanced", 2022, 1500.0, "White",22);
        Boat boat = new Boat("SACS", "Strider 15", 2022, 50000.0, "Electric-Blue",100);
        Suv suv = new Suv("Jeep", "Grand Cherokee", 2022, 40000.0,"Diamond Black",5, 4, true);
        Bus bus = new Bus("Mercedes", "Sprinter", 2022, 60000.0, "Diamond Red",40);


        System.out.println("Car: " + car.getBrand() + " Model: " + car.getModel() + " Year: " + car.getYear() + " Color: " + car.getColor());

        //Calling polymorphic methods
        truck.startVehicle();
        truck.drive();
        motorcycle.startVehicle();
        motorcycle.drive();

        //Overridden methods
        System.out.println(car.equals(motorcycle));
        System.out.println(car.hashCode());
        System.out.println(motorcycle.hashCode());


        Vehicle vehicle1 = new SportCar("Toyota", "4X4", 2015, 8.000, "Black");
        Vehicle vehicle2 = new Truck("Mercedes", "RX500", 2015, 8.000, "Black", 100000, true);
        ElectricCar vehicle3 = new ElectricCar("Tesla", "X", 2023, 50.000, "Electric-Red", 4, 5, 150);


        vehicle1.startVehicle();
        vehicle1.move();


        vehicle2.startVehicle();
        vehicle2.move();

        ((Loadable) vehicle2).loadCargo();


        vehicle3.startVehicle();
        vehicle3.move();
        vehicle3.charge();
        vehicle3.enableSelfDriving();

        Garage.addVehicle();
        Garage.addVehicle();
        System.out.println("The total vehicles in the garage is: " + Garage.getNumberOfVehicles());
    }


}
