package gyakorlas2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class SortingTest {

    @Test
    void testSortArray() {

        int[] i = new int[50];

        Random random = new Random(5);

        for (int g = 0; g < i.length; g++) {
            i[g] = random.nextInt(60);
        }

        System.out.println(Arrays.toString(i));

        Arrays.sort(i);

        assertEquals(0, i[0]);
    }

    @Test
    void listTest() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 3, 3, 3, 4, 5);
intList.sort(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
});
        Collections.sort(intList);
        assertEquals(1, intList.get(0));
    }
@Test
void testSet(){

        Set<Trainer2> s = new TreeSet<>();

        s.add(new Trainer2("JAck", 3));
        s.add(new Trainer2("Joe", 2));
        s.add(new Trainer2("Jane", 1));

    System.out.println(s);


}
}

