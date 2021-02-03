package gyakorlas2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {


    @Test
    void testRemove() {

        List<Integer> l = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

        Iterator<Integer> i = l.iterator();

        while (i.hasNext()) {
            int j = i.next();
            System.out.println(j);

            if (j % 2 == 0) {
                i.remove();
            }

        }
        System.out.println(l);
        assertEquals("[1, 3, 5, 7]", l.toString());

    }
}
