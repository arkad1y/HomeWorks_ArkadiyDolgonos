package com.levelup.skateboard.bord;

import com.levelup.skateboard.exceptions.JumpCountException;

/**
 * Created by admin on 28.08.2016.
 */
public class Board {
    private String name;
    private int jumpCount;
    private BoardType boardType;

    public Board() {
    }

    public Board(String name, BoardType boardType) {
        this.name = name;
        this.boardType = boardType;
    }

    public Board(String name, int jumpCount, BoardType boardType) {
        this.name = name;
        this.jumpCount = jumpCount;
        this.boardType = boardType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumpCount() {
        return jumpCount;
    }

    public void setJumpCount(int jumpCount) {
        this.jumpCount = jumpCount;
    }

    public BoardType getBoardType() {
        return boardType;
    }

    public void setBoardType(BoardType boardType) {
        this.boardType = boardType;
    }

    public boolean jump() {
        jumpCount++;
        if (jumpCount <= boardType.getMaxJumpCount()) {
            return true;
        }
        throw new JumpCountException("current jump count:"+jumpCount);
    }
}
