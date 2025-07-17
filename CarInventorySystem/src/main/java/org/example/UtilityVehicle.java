package org.example;

public class UtilityVehicle extends Car {
    private boolean fourWheelsDrive;

    // constructors
    public UtilityVehicle() {
        super();
    }
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelsDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelsDrive = fourWheelsDrive;
    }

    // getters and setters
    public boolean isFourWheelsDrive() {
        return fourWheelsDrive;
    }

    public void setFourWheelsDrive(boolean fourWheelsDrive) {
        this.fourWheelsDrive = fourWheelsDrive;
    }

    // methods

    @Override
    public String getCarInfo() {
        return super.getCarInfo() + ", Four-Wheel Drive: " + (fourWheelsDrive ? "Yes" : "No");
    }

}
