package week10d05;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void findMinSum1() {
        int[] b = new int[5];
        b[0] = 5;
        b[1] = 4;
        b[2] = 3;
        b[3] = 2;
        b[4] = 1;


        assertEquals(2.5, Calculator.findMinSum(b));


    }

    @Test
    void findMinSum2() {
        int[] b = new int[10];
        b[0] = 0;
        b[1] = 0;
        b[2] = 0;
        b[3] = 5;
        b[4] = 5;
        b[5] = 5;
        b[6] = 5;
        b[7] = 5;
        b[8] = 5;
        b[9] = 5;


        assertEquals(1.25, Calculator.findMinSum(b));


    }

    @Test
    void findMinSumIsNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.findMinSum(null);
        });


        assertEquals("Array is null!", ex.getMessage());
    }

    @Test
    void findMinSum3() {
        int[] b = new int[2];
        b[0] = 2;
        b[1] = 1;


        Exception actualException = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.findMinSum(b);
        });
        assertEquals("A 2 méretű tömbben található számok átlaga: 1.5", actualException.getMessage());


    }

    @Test
    void findMinSum4() {
        int[] b = new int[3];
        b[0] = 2;
        b[1] = 1;
        b[2] = -3;


        Exception actualException = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.findMinSum(b);

        });
        assertEquals("A 3 méretű tömbben található számok átlaga: 0.0", actualException.getMessage());


    }

}