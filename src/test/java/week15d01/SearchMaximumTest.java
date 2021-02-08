package week15d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week10d02.MaxTravel;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


class SearchMaximumTest {

    @Test
    void searchMaximum() {
        SearchMaximum sm = new SearchMaximum();

        Map<Double, Double> item = new HashMap<>();

        item.put(0d, 1d);
        item.put(1d, 2d);
        item.put(2d, 3d);
        item.put(3d, 4d);
        item.put(4d, 5d);
        item.put(5d, 4d);
        item.put(6d, 3d);
        item.put(7d, 2d);
        item.put(8d, 1d);
        assertEquals("x:4.0" + "\n" + "y:5.0", sm.searchMaximum(item).toString());
        Coordinate coordinate = new Coordinate(4.0, 5.0);
        assertTrue(coordinate.equals(sm.searchMaximum(item)));


    }


    @Test
    void searchMaximumIsEmpty() {


        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SearchMaximum sm = new SearchMaximum();
            Map<Double, Double> item = new HashMap<>();
            sm.searchMaximum(item);
        });


        assertEquals("Map is Empty!", ex.getMessage());


    }


}
