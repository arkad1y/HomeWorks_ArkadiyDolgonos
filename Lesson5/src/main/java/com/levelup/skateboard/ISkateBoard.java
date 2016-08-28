package com.levelup.skateboard;

import com.levelup.skateboard.bord.Board;
import com.levelup.skateboard.wheel.Wheel;

/**
 * Created by admin on 28.08.2016.
 */
public interface ISkateBoard {
    boolean jump();

    boolean rideForward(int distance);

    boolean ride(int distance, Side side);

    SkateBoardState checkState();

    boolean setBoard(Board board);

    boolean setWheels(Wheel[] wheels);

}
