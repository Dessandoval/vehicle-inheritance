package com.pluralsight;

public class Hovercraft extends Vehicle {

    private boolean fan;
    private boolean rubberSkirt;

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
