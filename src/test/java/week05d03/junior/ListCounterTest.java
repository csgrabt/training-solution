package week05d03.junior;
import org.junit.jupiter.api.Test;
import week05d03.junior.ListCounter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class ListCounterTest {


    @Test
     void listCounterTestEmpty() {
        List<String> list = new ArrayList<>();
        ListCounter listCounter = new ListCounter();
        assertEquals(0, listCounter.counterAa(list));
        assertEquals(0, listCounter.counterAb(list));

    }

    @Test
     void listCounterTestA() {
        List<String> list = new ArrayList<>();
        list.add("alma");
        list.add("barack");

        ListCounter listCounter = new ListCounter();
        assertEquals(1, listCounter.counterAa(list));
        assertEquals(1, listCounter.counterAb(list));

    }

    @Test
     void listCounterTestAa() {
        List<String> list = new ArrayList<>();
        list.add("alma");
        list.add("Alma");
        list.add("barack");

        ListCounter listCounter = new ListCounter();
        assertEquals(2, listCounter.counterAa(list));
        assertEquals(2, listCounter.counterAb(list));

    }

    @Test
     void listCounterTestNoAa() {
        List<String> list = new ArrayList<>();
        list.add("lma");
        list.add("lma");
        list.add("barack");

        ListCounter listCounter = new ListCounter();
        assertEquals(0, listCounter.counterAa(list));
        assertEquals(0, listCounter.counterAb(list));

    }



}
