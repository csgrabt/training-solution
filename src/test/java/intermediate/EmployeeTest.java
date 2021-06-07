package intermediate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    List<Employee> employees = Arrays.asList(
            new Employee("John Doe"),
            new Employee("Jane Doe"),
            new Employee("Joe Doe"),
            new Employee("John Smith")
    );

    @Test
    void testFilter() {

        List<Employee> filtered =
                employees.stream().filter(e -> e.getName().startsWith("John"))
                        .collect(Collectors.toList());


        assertEquals(2, filtered.size());
        assertEquals("John Doe", filtered.get(0).getName());

    }

    @Test
    void testDistinct() {
        List<String> filtered = Stream.of("John", "John", "Jane", "John")
                .distinct()
                .collect(Collectors.toList());

        assertEquals(2, filtered.size());
        assertEquals("John", filtered.get(0));


    }

    @Test
    void testLimitSkip() {
        List<Employee> filtered = employees.stream()
                .skip(1).limit(2)
                .collect(Collectors.toList());


        assertEquals(2, filtered.size());
        assertEquals("Jane Doe", filtered.get(0).getName());
    }

    @Test
    void testInfinite() {
        List<Integer> numbers = Stream.iterate(1, n -> n + 2).skip(2).limit(3).collect(Collectors.toList());

        assertEquals(Arrays.asList(5, 7, 9), numbers);

    }


    @Test
    void testMap() {

        List<String> names = employees.stream().limit(2).map(Employee::getName).collect(Collectors.toList());


        assertEquals(Arrays.asList("John Doe", "Jane Doe"), names);


    }

    @Test
    void testFlatMap() {
        List<String> s1 = Arrays.asList("John Doe", "Jane Doe");
        List<String> s2 = Arrays.asList("Jack Doe", "Joe Doe");

        List<String> s3 = Stream.of(s1, s2).flatMap(l -> l.stream()).collect(Collectors.toList());

        assertEquals(Arrays.asList("John Doe", "Jane Doe", "Jack Doe", "Joe Doe"), s3);

    }

    @Test
    void testSorted() {
        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        assertEquals("Jane Doe", sorted.get(0).getName());
        assertEquals(4, sorted.size());
    }

    @Test
    void testPeek() {
        List<String> names= employees.stream()
                .map(Employee::getName)
                .sorted()
                .peek(System.out::println)
                .limit(2)
                .collect(Collectors.toList());

        assertEquals(Arrays.asList("Jane Doe", "Joe Doe"), names);



    }


}