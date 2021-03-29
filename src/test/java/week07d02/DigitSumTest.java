package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitSumTest {

    @Test
    void digitSumTest() {
        assertEquals(3, DigitSum.sumOfDigits(12));
    }

    @Test
    void digitSumTest2() {
        assertEquals(3, DigitSum.sumOfDigits2(12));
    }


    @Test
    void digitSumTest3() {
        assertEquals(3, DigitSum.sumOfDigits3(12));
    }

    @Test
    void digitSumTest4() {
        assertEquals(3, DigitSum.sumOfDigits4(12));
    }

}