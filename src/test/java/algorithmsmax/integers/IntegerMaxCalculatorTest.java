package algorithmsmax.integers;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class IntegerMaxCalculatorTest {
    IntegerMaxCalculator test = new IntegerMaxCalculator();

    @Test
    void testMax() {
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(i % 30);
        }


        assertEquals(29, test.max(integers));

    }

    @Test
    void listIsnull() {

        IllegalArgumentException ioe = assertThrows(IllegalArgumentException.class, () ->
                test.max(null));

        assertEquals("List is empty or null!", ioe.getMessage());
    }


    @Test
    void listIsEmpty() {
        List<Integer> integers = List.of();
        IllegalArgumentException ioe = assertThrows(IllegalArgumentException.class, () ->
                test.max(integers));

        assertEquals("List is empty or null!", ioe.getMessage());
    }

}
