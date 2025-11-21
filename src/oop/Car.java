package oop;

public class Car {

    private String brand;
    private String model;
    private String year;
    private Engine engine;

    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine;
     engine.starCar();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
