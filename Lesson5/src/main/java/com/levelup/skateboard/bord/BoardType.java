package com.levelup.skateboard.bord;


public enum BoardType {
    WOOD(100), CARBON(200), PLASTIC(150);
    private final int maxJumpCount;

    BoardType(int maxJumpCount) {
        this.maxJumpCount = maxJumpCount;
    }

    public int getMaxJumpCount() {
        return maxJumpCount;
    }

}
