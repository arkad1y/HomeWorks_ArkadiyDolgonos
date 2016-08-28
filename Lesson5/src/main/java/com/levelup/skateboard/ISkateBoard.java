package com.levelup.skateboard;

import com.levelup.skateboard.bord.Board;
import com.levelup.skateboard.wheel.Wheel;

import java.util.List;

public interface ISkateBoard {//main functions of any skateboard

    boolean jump();

    boolean rideForward(int distance);

    boolean ride(int distance, Side side);

    List<SkateBoardState> checkState();

    boolean setBoard(Board board);

    boolean setWheels(Wheel[] wheels);

}
