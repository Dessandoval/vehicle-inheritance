package com.pluralsight;

public class Car extends Vehicle {

    private int numDoors;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numDoors) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}