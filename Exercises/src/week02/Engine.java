package week02;

public class Engine {


    private double engineCapacity;

    private String type;


    public Engine(double engineCapacity, String type) {
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
