package com.levelup.skateboard.wheel;


import com.levelup.skateboard.Side;
import com.levelup.skateboard.exceptions.WheelWornOutException;

public class Wheel {//describe simple skateboard wheel and main functionality
    private String name;
    private BearingType bearingType; // store bearing type
    private int distance; //save the pasted distance of wheel

    public Wheel() {// create wheel with default parameters
        name = "default";
        bearingType = BearingType.ROLLING;

    }

    public Wheel(String name, BearingType bearingType, int distance) { // create wheel from incoming parameters
        this.name = name;
        this.bearingType = bearingType;
        this.distance = distance;
    }

    public Wheel(String name, BearingType bearingType) {// create wheel with name and bearing type
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

    public boolean run(int distance, Side side) {//try to run. if passed distance more than max possible distance -
        // we throw WheelWornOutException. if ok - just add input distance to passed distance
        this.distance += distance;
        if (this.distance > bearingType.getMaxDistance()) {
            throw new WheelWornOutException("your distance: " + this.distance);
        }
        return true;
    }

    public boolean isOk() {
        return distance < bearingType.getMaxDistance();
    }//check passed distance and max possible
    // distance

    @Override
    public String toString() {
        return "Wheel{" +
                "name='" + name + '\'' +
                ", bearingType=" + bearingType +
                ", distance=" + distance +
                '}';
    }
}
