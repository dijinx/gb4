package ru.geekbrains;

import im.TriangleSquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;


public class TriangleTest {

    @Test
    public void TestSimple() {

        System.out.println("Test Start!");
        double res = TriangleSquare.geroneSquare(14, 12, 12);
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        String res2 = decimalFormat.format(res);
        Assertions.assertEquals(res2, "68,23");
        if (res2.equals("68,23"))
            System.out.println("Ожидаемый результат: " + "68,23" + "\n" + "Фактический результат: " + res2 + "\n" + "Test passed!");
        else System.out.println("Test failed!");
        System.out.println("Test STOP!");
    }
}
