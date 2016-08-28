package com.levelup.skateboard;

import com.levelup.skateboard.bord.Board;
import com.levelup.skateboard.wheel.Wheel;

import java.util.List;

/**
 * Created by admin on 28.08.2016.
 */
public interface ISkateBoard {
    boolean jump();

    boolean rideForward(int distance);

    boolean ride(int distance, Side side);

    List<SkateBoardState> checkState();

    boolean setBoard(Board board);

    boolean setWheels(Wheel[] wheels);

}
