package gyakorlas2;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionsTest {

    @Test
    void testCollections() {
        List<Integer> elements = new ArrayList<>(List.of(1, 2));
        List<Integer> l = Collections.unmodifiableList(elements);

        assertEquals(elements, l);

        elements.add(3);
        assertEquals(3, l.size());
    }


    @Test
    void testReverse() {
        List<Integer> elements = new ArrayList<>(List.of(1, 2));

        Collections.reverse(elements);

        System.out.println(elements);

    }


    @Test
    void testShuffle() {
        List<Integer> elements =new ArrayList<>(List.of(1, 2, 3, 4));
        Random rnd = new Random(5);
        Collections.shuffle(elements, rnd);

        System.out.println(elements);

    }
}
