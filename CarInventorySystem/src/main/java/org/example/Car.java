package org.example;

public abstract class Car {

    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    // constructors
    public Car(){}

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    // getters and setters
    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // methods

    public String getCarInfo() {
        return "VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage;
    }

}
