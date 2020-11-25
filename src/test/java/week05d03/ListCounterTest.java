package week05d03;
import org.junit.jupiter.api.Test;
import week05d02.ChangeLetter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {


    @Test
    public void listCounterTestEmpty() {
        List<String> list = new ArrayList<>();
        ListCounter listCounter = new ListCounter();
        assertEquals(0, listCounter.counterAa(list));
        assertEquals(0, list.size());
    }

    @Test
    public void listCounterTestA() {
        List<String> list = new ArrayList<>();
        list.add("alma");
        list.add("barack");

        ListCounter listCounter = new ListCounter();
        assertEquals(1, listCounter.counterAa(list));
        assertEquals(2, list.size());
    }

    @Test
    public void listCounterTestAa() {
        List<String> list = new ArrayList<>();
        list.add("alma");
        list.add("Alma");
        list.add("barack");

        ListCounter listCounter = new ListCounter();
        assertEquals(2, listCounter.counterAa(list));
        assertEquals(3, list.size());
    }

    @Test
    public void listCounterTestNoAa() {
        List<String> list = new ArrayList<>();
        list.add("lma");
        list.add("lma");
        list.add("barack");

        ListCounter listCounter = new ListCounter();
        assertEquals(0, listCounter.counterAa(list));
        assertEquals(3, list.size());
    }



}
