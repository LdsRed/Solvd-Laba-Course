package models;

public class Wheel {

    private int ring;

    private String manufacturer;
    private double width;


    public Wheel(){}

    public Wheel(int ring, String manufacturer, double width) {
        this.ring = ring;
        this.manufacturer = manufacturer;
        this.width = width;
    }

    public int getRing() {
        return ring;
    }

    public void setRing(int ring) {
        this.ring = ring;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
