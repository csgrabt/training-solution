package week07d03.junior;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {


    @Test
    void numberListTestTrue() {
        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 10, 15);
        assertTrue(NumberList.isIncreasing(intList));

    }


    @Test
    void numberListTestFalse() {
        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 10, 1);
        assertFalse(NumberList.isIncreasing(intList));

    }


    @Test
    public void numberListTestEqual() {
        List<Integer> intList = Arrays.asList(10, 10, 10, 10, 10, 10, 10);
        assertTrue(NumberList.isIncreasing(intList));

    }


    @Test
    public void numberListTestNegativ() {
        List<Integer> intList = Arrays.asList(10, 10, 10, -10, 10, 10, 10);
        assertFalse(NumberList.isIncreasing(intList));

    }


}