package gyakorlasStream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
    void testCount() {
        assertEquals(0, Stream.empty().count());
        assertEquals(2, Stream.of(new Employee("J"),
                new Employee("G")).count()
        );
        Stream<Employee> s = Stream.of(new Employee("J"),
                new Employee("G"));
        assertEquals(2, s.count());


        assertEquals(4, employees.stream().count());

    }

    @Test
    void testMin() {
        assertEquals("Jane Doe", employees.stream().min(Comparator.comparing(Employee::getName)).get().getName());
    }


    @Test
    void testFirst() {
        assertEquals("John Doe", employees.stream().findFirst().get().getName());


    }

    @Test
    void testAllMatch() {

        assertTrue(employees.stream().allMatch(e -> e.getName().length() > 5));
        assertFalse(employees.stream().allMatch(e -> e.getName().startsWith("a")));
    }

    @Test
    void testForEach() {

        employees.forEach(e -> e.setName(e.getName().toUpperCase()));

        assertEquals("JOHN DOE", employees.get(0).getName());
    }


}