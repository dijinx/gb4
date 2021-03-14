package ru.geekbrains;

import im.TriangleSquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;


public class TriangleTest {

    @Test
    public void TestSimple() {

        System.out.println("Test Start!");
        double res = TriangleSquare.geroneSquare(14,12,12);
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        String res2 = decimalFormat.format(res);
        Assertions.assertEquals(res2, "68,23" );
        System.out.println("Test STOP!");
    }
}
