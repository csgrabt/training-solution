package week08d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {




    @Test
    public void mathAlgoritms() {

        assertEquals(2, MathAlgorithms.greatestCommonDivisor(8, 6));
        assertEquals(2, MathAlgorithms.greatestCommonDivisor(6, 4));
        assertEquals(2, MathAlgorithms.greatestCommonDivisor(-4, 6));
        assertEquals(2, MathAlgorithms.greatestCommonDivisor(-6, -4));
        assertEquals(1, MathAlgorithms.greatestCommonDivisor(-21, -2));
    }



    @Test

    public void isNegative() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            MathAlgorithms.greatestCommonDivisor(-5, 0);
        });
        assertEquals("Cannot be divided by zero", ex.getMessage());
    }




}
