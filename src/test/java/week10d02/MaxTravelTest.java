package week10d02;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week05d05.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    void makeTheList() {
        MaxTravel maxTravel = new MaxTravel();
        assertEquals("[1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", maxTravel.makeTheList(List.of(12,12,0,3,4,4)).toString());
    }

    @Test
    void maxOfList() {
    MaxTravel maxTravel = new MaxTravel();
    assertEquals(2, maxTravel.maxOfList(List.of(1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    void indexOfMaximums() {
        MaxTravel maxTravel = new MaxTravel();
        assertEquals("[4, 12]", maxTravel.indexOfMaximums(List.of(1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), 2).toString());
    }



    @Test
    void getMaxIndex() {
    MaxTravel maxTravel = new MaxTravel();
    assertEquals("[4, 12]", maxTravel.getMaxIndex(List.of(12,12,0,3,4,4)).toString());
    }


    @Test
    void getMaxIndexListIsEmpty() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            MaxTravel maxTravel = new MaxTravel();
            List<Integer> list = new ArrayList<>();
            maxTravel.getMaxIndex(list);
        });




        assertEquals("List is Empty!", ex.getMessage());
    }


    @Test
    void getMaxIndexIsNull() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            MaxTravel maxTravel = new MaxTravel();
            List<Integer> list = null;
            maxTravel.getMaxIndex(list);
        });




        assertEquals("List is null!", ex.getMessage());
    }
}