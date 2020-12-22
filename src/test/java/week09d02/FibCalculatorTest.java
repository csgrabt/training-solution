package week09d02;

import org.junit.jupiter.api.Test;
import week08d05.MathAlgorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibCalculatorTest {


    @Test
    public void sumEvens() {

        assertEquals(10, FibCalculator.sumEvens(9));
        assertEquals(60696, FibCalculator.sumEvens(190000));
}


}
