package com.pluralsight;

public class Hovercraft extends Vehicle {

    private boolean fan;
    private boolean rubberSkirt;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean fan, boolean rubberSkirt) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.fan = fan;
        this.rubberSkirt = rubberSkirt;
    }

    public boolean hasFan() {
        return fan;
    }

    public void setFan(boolean fan) {
        this.fan = fan;
    }

    public boolean hasRubberSkirt() {
        return rubberSkirt;
    }

    public void setRubberSkirt(boolean rubberSkirt) {
        this.rubberSkirt = rubberSkirt;
    }
}
