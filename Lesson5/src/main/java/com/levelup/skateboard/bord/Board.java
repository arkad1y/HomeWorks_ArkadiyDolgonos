package com.levelup.skateboard.bord;

import com.levelup.skateboard.exceptions.JumpCountException;
import com.levelup.skateboard.impl.SkateBoard;
import com.levelup.skateboard.wheel.Wheel;

import java.util.Arrays;
import java.util.List;

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
        throw new JumpCountException("current jump count:" + jumpCount);
    }

    public boolean isOk() {
        return jumpCount < boardType.getMaxJumpCount();
    }

    @Override
    public String toString() {
        return "Board{" +
                "name='" + name + '\'' +
                ", jumpCount=" + jumpCount +
                ", boardType=" + boardType +
                '}';
    }

    public static void main(String[] args) {
        List<Object> list = Arrays.asList(new Board(), new Wheel(), new SkateBoard(), new Object());
        for (Object obj : list) {
            System.out.println(obj);// == obj.toSting()
        }
    }
}
