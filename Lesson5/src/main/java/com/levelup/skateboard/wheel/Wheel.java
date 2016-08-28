package com.levelup.skateboard.wheel;


import com.levelup.skateboard.Side;
import com.levelup.skateboard.exceptions.WheelWornOutException;

public class Wheel {
    private String name;
    private BearingType bearingType;
    private int distance;

    public Wheel() {
        name = "default";
        bearingType = BearingType.ROLLING;

    }

    public Wheel(String name, BearingType bearingType, int distance) {
        this.name = name;
        this.bearingType = bearingType;
        this.distance = distance;
    }

    public Wheel(String name, BearingType bearingType) {
        this.name = name;
        this.bearingType = bearingType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BearingType getBearingType() {
        return bearingType;
    }

    public void setBearingType(BearingType bearingType) {
        this.bearingType = bearingType;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean run(int distance, Side side) {
        this.distance += distance;
        if (this.distance > bearingType.getMaxDistance()) {
            throw new WheelWornOutException("your distance: " + this.distance);
        }
        return true;
    }

    public boolean isOk() {
        return distance < bearingType.getMaxDistance();
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "name='" + name + '\'' +
                ", bearingType=" + bearingType +
                ", distance=" + distance +
                '}';
    }
}
