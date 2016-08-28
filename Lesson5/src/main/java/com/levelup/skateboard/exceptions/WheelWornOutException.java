package com.levelup.skateboard.exceptions;

/**
 * Created by admin on 28.08.2016.
 */
public class WheelWornOutException extends RuntimeException {
    private static final String ERROR_MSG = "Wheels are worn out";

    public WheelWornOutException() {
        super(ERROR_MSG);
    }

    public WheelWornOutException(String message) {
        super(message + "\t || \t" + ERROR_MSG);
    }
}
