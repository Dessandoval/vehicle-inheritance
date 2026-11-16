package com.pluralsight;

public class SemiTruck extends Vehicle {

    private boolean trailer;

    public boolean hasTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }
}
