package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberListTest {


    @Test
    public void numberListTesttrue() {
        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 10, 15);
        assertEquals(true, NumberList.isIncreasing(intList));

    }




    @Test
    public void numberListTestFalse() {
        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 10, 1);
        assertEquals(false, NumberList.isIncreasing(intList));

    }




    @Test
    public void numberListTestEqual() {
        List<Integer> intList = Arrays.asList(10, 10, 10, 10, 10, 10, 10);
        assertEquals(true, NumberList.isIncreasing(intList));

    }



    @Test
    public void numberListTestNegativ() {
        List<Integer> intList = Arrays.asList(10, 10, 10, -10, 10, 10, 10);
        assertEquals(false, NumberList.isIncreasing(intList));

    }




}