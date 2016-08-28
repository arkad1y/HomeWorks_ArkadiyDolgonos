package com.levelup.skateboard.impl;


import com.levelup.skateboard.ISkateBoard;
import com.levelup.skateboard.Side;
import com.levelup.skateboard.SkateBoardState;
import com.levelup.skateboard.bord.Board;
import com.levelup.skateboard.wheel.Wheel;

import java.util.ArrayList;
import java.util.List;

public class SkateBoard implements ISkateBoard {// skateboard implementation
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
    }//  we call method jump on board and save count of jumps in board

    @Override
    public boolean rideForward(int distance) {// we call run at all wheels with forward side
        for (Wheel wheel : wheels) {
            wheel.run(distance, Side.FORWARD);
        }
        return true;
    }

    /**
     * @param distance distance, what will run skateboard
     * @param side     - whew will run skateboard
     * @return true, if skate passed distance
     */
    @Override
    public boolean ride(int distance, Side side) {
        for (Wheel wheel : wheels) {
            wheel.run(distance, side);
        }
        return true;
    }

    /**
     * @return
     */
    @Override
    public List<SkateBoardState> checkState() {
        //check board state
        List<SkateBoardState> boardStatesResult = new ArrayList<>(2);
        if (!board.isOk()) {
            boardStatesResult.add(SkateBoardState.BOARD_WORN_OUT);
        }

        //check wheels state
        for (Wheel wheel : wheels) {
            if (!wheel.isOk()) {
                boardStatesResult.add(SkateBoardState.WHEELS_WORN_OUT);
                break;
            }
        }

        //if there are no troubles with wheels and board we add status ok to skateboard checkstate
        if (boardStatesResult.isEmpty()) {
            boardStatesResult.add(SkateBoardState.OK);
        }
        return boardStatesResult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Board getBoard() {
        return board;
    }

    /**
     * @param board input board
     * @return if input board have broken, we not change our board and return false
     */
    @Override
    public boolean setBoard(Board board) {

        if (board.isOk()) {
            this.board = board;
            return true;
        }
        return false;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    /**
     * @param wheels input wheels
     * @return if input wheels have broken, we not change our board and return false
     */
    @Override
    public boolean setWheels(Wheel[] wheels) {
        for (Wheel wheel : wheels) {
            if (!wheel.isOk()) {
                return false;
            }
        }
        this.wheels = wheels;
        return true;
    }


}
