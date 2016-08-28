package com.levelup.skateboard.board;

import com.levelup.skateboard.bord.Board;
import com.levelup.skateboard.bord.BoardType;
import com.levelup.skateboard.exceptions.JumpCountException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by admin on 28.08.2016.
 */
public class BoardTest {
    private Board board;

    @Before
    public void setUp() {

    }

    @Test
    public void shouldJumpSuccesWithCarbonBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 0, BoardType.CARBON);
        //WHEN
        boolean actualResult = board.jump();
        //THEN
        assertTrue("should jump with carbon board", actualResult == expectedResult);
    }

    @Test
    public void shouldJumpSuccesWithWoodenBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 0, BoardType.WOOD);
        //WHEN
        boolean actualResult = board.jump();
        //THEN
        assertTrue("should jump with wood board", actualResult == expectedResult);
    }

    @Test(expected = JumpCountException.class)
    public void shouldThrowExceptionWhenJumpCarbonBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 200, BoardType.CARBON);
        //WHEN
        boolean actualResult = board.jump();
    }

    @Test(expected = JumpCountException.class)
    public void shouldThrowExceptionWhenJumpWoodBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 100, BoardType.WOOD);
        //WHEN
        boolean actualResult = board.jump();
    }

    @Test
    public void shouldIsOkTrueWithCarbonBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 0, BoardType.CARBON);
        //WHEN
        boolean actualResult = board.isOk();
        //THEN
        assertEquals("should return isOk==true with carbon board and jumpCount=0",
                actualResult, expectedResult);
    }

    @Test
    public void shouldIsOkTrueWithWoodBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 0, BoardType.WOOD);
        //WHEN
        boolean actualResult = board.isOk();
        //THEN
        assertEquals("should return isOk==true with wood board and jumpCount=0",
                actualResult, expectedResult);
    }

    @Test
    public void shouldIsOkFalseWithCarbonBoard() {
        //GIVEN
        boolean expectedResult = false;
        board = new Board("test", 200, BoardType.CARBON);
        //WHEN
        boolean actualResult = board.isOk();
        //THEN
        assertEquals("should return isOk==true with carbon board and jumpCount=200",
                actualResult, expectedResult);
    }

    @Test
    public void shouldIsOkFalseWithWoodBoard() {
        //GIVEN
        boolean expectedResult = false;
        board = new Board("test", 100, BoardType.WOOD);
        //WHEN
        boolean actualResult = board.isOk();
        //THEN
        assertEquals("should return isOk==false with wood board and jumpCount=100",
                actualResult, expectedResult);
    }


}
