package com.levelup.skateboard.impl;


import com.levelup.skateboard.ISkateBoard;
import com.levelup.skateboard.Side;
import com.levelup.skateboard.SkateBoardState;
import com.levelup.skateboard.bord.Board;
import com.levelup.skateboard.wheel.Wheel;

public class SkateBoard implements ISkateBoard {
    private String name;
    private Board board;
    private Wheel[] wheels;

    public SkateBoard() {
    }

    public SkateBoard(String name, Board board, Wheel[] wheels) {
        this.name = name;
        this.board = board;
        this.wheels = wheels;
    }


    @Override
    public boolean jump() {
        return board.jump();
    }

    @Override
    public boolean rideForward(int distance) {
        for (Wheel wheel : wheels) {
            wheel.run(distance, Side.FORWARD);
        }
        return true;
    }

    @Override
    public boolean ride(int distance, Side side) {
        for (Wheel wheel : wheels) {
            wheel.run(distance, side);
        }
        return true;
    }

    @Override
    public SkateBoardState checkState() {
        return null;
    }

    @Override
    public boolean setBoard(Board board) {
        return false;
    }

    @Override
    public boolean setWheels(Wheel[] wheels) {
        return false;
    }
}
