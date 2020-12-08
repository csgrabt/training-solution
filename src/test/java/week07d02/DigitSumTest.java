package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week07d01.MathAlgorithms.isPrime;

public class DigitSumTest {

    @Test
    public void digitSumTest() {
        assertEquals(3, DigitSum.sumOfDigits(12));
    }
}