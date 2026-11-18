package com.pluralsight;

public class App {
    public static void main(String[] args) {

        // A Moped can call setColor() because Moped inherits all methods from Vehicle.

        Moped slowRide = new Moped("Red", 1, 5000, 5, true, true);
        System.out.println("Moped color: " + slowRide.getColor());

        Car car = new Car("Yellow", 2, 10000, 5, 4);
        System.out.println("Car color: " + car.getColor() + " " + "Car Doors: " + car.getNumDoors());

        SemiTruck bigSemi = new SemiTruck("Blue", 3, 20000, 100, true);
        System.out.println("SemiTruck has trailer: " + bigSemi.hasTrailer());

        Hovercraft swampCraft = new Hovercraft("Green", 2, 20, 5, true, false);
        System.out.println("Does the Hovercraft have a ruberSkirt trim: " + swampCraft.hasRubberSkirt());


    }
}
