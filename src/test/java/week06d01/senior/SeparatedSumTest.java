package week06d01.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static week06d01.senior.SeparatedSum.sum;

class SeparatedSumTest {

    @Test
    void sumTest() {
        String s = "1,01;1,01;-1,01;-1.01";

        assertEquals(2.02, sum(s).getSumOfPositive());
        assertEquals(-2.02, sum(s).getSumOfNegative());
    }

    @Test
    void sumTestNoComa() {
        String s = "101;101;-101;-101";

        assertEquals(202, sum(s).getSumOfPositive());
        assertEquals(-202, sum(s).getSumOfNegative());
    }

}