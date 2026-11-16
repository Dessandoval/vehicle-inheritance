package com.pluralsight;

public class Moped extends Vehicle {

    private boolean kickStand;
    private boolean pedals;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean kickStand, boolean pedals) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.kickStand = kickStand;
        this.pedals = pedals;
    }

    public boolean hasKickStand() {
        return kickStand;
    }

    public void setKickStand(boolean kickStand) {
        this.kickStand = kickStand;
    }

    public boolean hasPedals() {
        return pedals;
    }

    public void setPedals(boolean pedals) {
        this.pedals = pedals;
    }
}
