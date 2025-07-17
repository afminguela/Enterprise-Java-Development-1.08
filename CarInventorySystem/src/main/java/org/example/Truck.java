package org.example;

public class Truck extends Car {
    private int towingCapacity;

    // constructors
    public Truck() {
        super();
    }

    public Truck(String vinNumber, String make, String model, int mileage, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    // getters and setters
    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    // methods
    @Override
    public String getCarInfo() {
        return super.getCarInfo() + ", Towing Capacity: " + towingCapacity + " KG";
    }
}
