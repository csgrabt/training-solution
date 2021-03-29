package week07d01.junior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static week07d01.junior.MathAlgorithms.*;

class MathAlgorithmsTest {


    @Test
    void primTest1() {
        assertTrue(isPrime(5));
        assertFalse(isPrime(6));
        assertFalse(isPrime(102));
        assertTrue(isPrime(9973));
        assertFalse(isPrime(1));
    }



    @Test
    void numberIsSmallerThanOne() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
            isPrime(0)
        );
        assertEquals("Invalid number!", ex.getMessage());
    }


}