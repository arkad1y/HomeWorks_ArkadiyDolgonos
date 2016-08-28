package com.levelup.skateboard.exceptions;

/**
 * Created by admin on 28.08.2016.
 */
public class JumpCountException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "out of jump count";

    public JumpCountException(String message) {
        super(DEFAULT_MESSAGE + "\t||\t" + message);
    }

    public JumpCountException() {
        super(DEFAULT_MESSAGE);
    }
}
