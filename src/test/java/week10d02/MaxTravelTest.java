package week10d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {
    MaxTravel maxTravel = new MaxTravel();
    List<Integer> list = new ArrayList<>();

    @Test
    void makeTheList() {
        assertEquals("[1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", maxTravel.makeTheList(List.of(12, 12, 0, 3, 4, 4)).toString());
    }

    @Test
    void maxOfList() {
        assertEquals(2, maxTravel.maxOfList(List.of(1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    void indexOfMaximums() {
        assertEquals("[4, 12]", maxTravel.indexOfMaximums(List.of(1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), 2).toString());
    }


    @Test
    void getMaxIndex() {
        assertEquals("[4, 12]", maxTravel.getMaxIndex(List.of(12, 12, 0, 3, 4, 4)).toString());
    }


    @Test
    void getMaxIndexListIsEmpty() {
        Exception ex = assertThrows(RuntimeException.class, () ->  maxTravel.getMaxIndex(list));
        assertEquals("List is Empty!", ex.getMessage());
    }


    @Test
    void getMaxIndexIsNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> maxTravel.getMaxIndex(null)
        );
        assertEquals("List is null!", ex.getMessage());
    }
}