package com.levelup.skateboard.wheel;

/**
 * Created by admin on 28.08.2016.
 */
public enum BearingType {
    ROLLING(1000), PLAIN(1500);
    private final int maxDistance;

    BearingType(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }
}
