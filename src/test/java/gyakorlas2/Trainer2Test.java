package gyakorlas2;

import org.junit.jupiter.api.Test;

import java.text.Collator;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Trainer2Test {


    @Test
    void testSort() {

        List<String> names = Arrays.asList("Joe", "Jack", "Jane");

        Collections.sort(names);
        System.out.println(names);

        assertEquals("[Jack, Jane, Joe]", names.toString());

    }

    @Test
    void testTrainer() {

        List<Trainer2> trainers = Arrays.asList(
                new Trainer2("Joe", 3),
                new Trainer2("Jack", 2),
                new Trainer2("Jack", 2),
                new Trainer2("Jane", 1)
        );
        Collections.sort(trainers);

        assertEquals("Jack", trainers.get(0).getName());

        Collections.sort(trainers, new SalaryComparator());

        assertEquals("Jane", trainers.get(0).getName());
    }


    public class SalaryComparator implements Comparator<Trainer2> {

        @Override
        public int compare(Trainer2 o1, Trainer2 o2) {
            return o1.getSalary() - o2.getSalary();
        }
    }

    @Test
    void testSortWithAccutes() {

        List<String> names = Arrays.asList("Joe", "Jack", "Jane", "éva", "Ábel", "joe");

        Collections.sort(names, Collator.getInstance(new Locale("hu", "HU")));

        System.out.println(names);
        assertEquals("[Ábel, éva, Jack, Jane, joe, Joe]", names.toString());

    }



}