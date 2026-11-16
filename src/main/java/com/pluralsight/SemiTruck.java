package com.pluralsight;

public class SemiTruck extends Vehicle {

    private boolean trailer;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean trailer) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.trailer = trailer;
    }

    public boolean hasTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }
}
