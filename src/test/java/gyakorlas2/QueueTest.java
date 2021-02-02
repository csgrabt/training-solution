package gyakorlas2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {


    @Test
    void testQueue() {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        int i = q.element();
        assertEquals(1, i);
        i = q.remove();
        assertEquals(1, i);
        assertEquals("[2]", q.toString());
        i = q.remove();
        assertEquals(0, q.size());

    }

    @Test
    void testStack() {
        Deque<Integer> d = new LinkedList<>();

        d.push(1);
        d.push(2);
        d.push(3);

        int i = d.peek();

        assertEquals(3, i);
        i = d.peek();

        assertEquals(3, i);

        i = d.pop();
        i = d.pop();

        assertEquals(2, i);
        i = d.pop();
        assertTrue(d.isEmpty());


    }
}
