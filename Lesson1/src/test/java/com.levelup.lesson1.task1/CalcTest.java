package com.levelup.lesson1.task1;


import org.junit.*;
import org.omg.CORBA.DoubleHolder;

import static junit.framework.Assert.*;

public class CalcTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }
    private Calc calc ;
    @Before
    public void beforeMethod() {
        System.out.println("before method");
        calc = new Calc();
    }

    @Test
    public void shouldSumCorrect() {
        long expectedSum =5;
        calc.setA(2);
        calc.setB(3);
        long actualSum = calc.sum();
        assertEquals("sum 2+3 should be 5",expectedSum, actualSum);
        System.out.println("shouldSumCorrect");

    }

    @Test
    public void shouldDivCorrect() {
        double expectedSum =3D;
        calc.setA(6);
        calc.setB(2);
        double actualSum = calc.div();
        assertEquals("div 6/2 should be 3",expectedSum, actualSum);
        System.out.println("shouldSumCorrect");
        System.out.println("shouldDivCorrect");

    }

    @Test
    public void shouldThrowExceptionWhenDivedeByZero() {
        double expectedSum =3D;
        calc.setA(6);
        calc.setB(0);
        double actualSum = calc.div();
        assertEquals("div 6/2 should be 3", Double.isInfinite(actualSum), true);
        System.out.println("shouldSumCorrect");
        System.out.println("shouldDivCorrect");

    }

    @After
    public void afterMethod() {
        System.out.println("after method");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }
}
