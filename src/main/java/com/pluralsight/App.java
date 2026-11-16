package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("red");
        slowRide.setFuelCapacity(5);

        System.out.println("Moped color: " + slowRide.getColor());

        Car car = new Car();
        car.setNumDoors(4);
        car.setColor("Yellow");
        System.out.println("Car color: " + car.getColor() + " " + "Car Doors: " + car.getNumDoors());


    }
}
