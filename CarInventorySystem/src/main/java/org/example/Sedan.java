package org.example;

public class Sedan extends Car {


    // constructors
    public Sedan() {
        super();
    }

    public Sedan(String vinNumber, String make, String model, int mileage, boolean sunroof) {
        super(vinNumber, make, model, mileage);

    }


    // methods
    @Override
    public String getCarInfo() {
        return super.getCarInfo();
    }
}
