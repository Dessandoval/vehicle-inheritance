package com.pluralsight;

public class Moped extends Vehicle {

    private boolean kickStand;
    private boolean pedals;

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
