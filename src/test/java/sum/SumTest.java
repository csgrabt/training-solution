package sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    List<Integer> values = new ArrayList<>();

   @BeforeEach
   void fillTheList() {
       Random rnd = new Random(5);
       for (int i = 0; i < 100000; i++) {
           values.add(rnd.nextInt(100));
       }
   }

    @Test
    void sum() {


        assertTrue(new Sum().sum(values, 4));
        assertFalse(new Sum().sum(values, 400));
        assertTrue(new Sum().sum2(values, 4));
        assertFalse(new Sum().sum2(values, 400));
    }
}