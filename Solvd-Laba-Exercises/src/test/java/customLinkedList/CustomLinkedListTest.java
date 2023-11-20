package customLinkedList;

import custom.CustomLinkedList;
import interfaces.Electric;
import models.ElectricCar;
import models.SportCar;
import models.Truck;
import models.Vehicle;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class CustomLinkedListTest {


    @Test
    public void testCustomLinkedList() {

        Vehicle sportCar = new SportCar("Ferrari");
        Vehicle truck = new Truck("Ford");
        ElectricCar electricCar = new ElectricCar("Tesla");

        CustomLinkedList<Vehicle> customLinkedList = new CustomLinkedList<>();

        customLinkedList.append(sportCar);
        customLinkedList.append(truck);
        customLinkedList.append(truck);
        customLinkedList.append(electricCar);

        customLinkedList.printLinkedList();

    }

    @Test
    public void testArrayList(){
        Truck axor = new Truck("Axor");
        Truck truck1 = new Truck("Accelo");
        Truck truck2 = new Truck("Arcos");
        Truck truck3 = new Truck("Zetros");
        Truck mercedez = new Truck("Mercedes", "Arcos", 2023, 17.000, "black", 300, true);


        List<Truck> truckList = new ArrayList<>();
        truckList.add(axor);
        truckList.add(truck1);
        truckList.add(truck2);
        truckList.add(truck3);
        truckList.add(mercedez);

        for (var truck : truckList) {
            truck.loadCargo();
            truck.drive();
            truck.move();
        }

        truckList.reversed();
        for (var truck : truckList) {
            System.out.println(truck.getBrand());
        }

    }

    @Test
    public void testLinkedList(){

        ElectricCar teslaS = new ElectricCar("Tesla", "S", 2023, 71.090, "Red", 4, 5, 150 );
        ElectricCar teslaY = new ElectricCar("Tesla", "Y", 2023, 71.090, "Blue", 4, 5, 150 );
        ElectricCar tesla3 = new ElectricCar("Tesla", "Y", 2023, 71.090, "Blue", 4, 5, 150 );

        List<ElectricCar> electricCarList = new ArrayList<>();

        electricCarList.add(teslaS);
        electricCarList.add(teslaY);
        electricCarList.add(tesla3);

        for (var carElectric : electricCarList){
            carElectric.move();
            carElectric.charge();
        }

    }


    @Test
    public void testHashSet(){
        Truck axor = new Truck("Axor");
        Truck truck1 = new Truck("Accelo");
        Truck truck2 = new Truck("Arcos");
        Truck truck3 = new Truck("Zetros");
        Truck mercedez = new Truck("Mercedes", "Arcos", 2023, 17.000, "black", 300, true);


        Set<Truck> truckHashSetList = new HashSet<>();
        truckHashSetList.add(axor);
        truckHashSetList.add(truck1);
        truckHashSetList.add(truck2);
        truckHashSetList.add(truck3);
        truckHashSetList.add(mercedez);


        truckHashSetList.forEach(System.out::println);


    }


    @Test
    public void testHashMap(){
        Truck axor = new Truck("Axor");
        Truck truck1 = new Truck("Accelo");
        Truck truck2 = new Truck("Arcos");
        Truck truck3 = new Truck("Zetros");
        Truck mercedez = new Truck("Mercedes", "Arcos", 2023, 17.000, "black", 300, true);


        Map<String, Truck> truckHashSetList = new HashMap<>();
        truckHashSetList.put("Axor", axor);
        truckHashSetList.put("Accelo", truck1);
        truckHashSetList.put("Arcos", truck2);
        truckHashSetList.put("Zetros", truck3);
        truckHashSetList.put("Mercedes", mercedez);


        for (Map.Entry<String, Truck> entry : truckHashSetList.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
