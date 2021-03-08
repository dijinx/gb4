package ru.geekbrains;

import im.TriangleSquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTest {

    @Test
    public void TestSimple() {

        System.out.println("Test Start!");
        double res = TriangleSquare.geroneSquare(14,12,12);
        Assertions.assertEquals(res, 68.23 );
        System.out.println("Test STOP!");
    }
}
