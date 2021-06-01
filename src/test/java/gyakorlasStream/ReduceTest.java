package gyakorlasStream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReduceTest {
    List<Employee> employees = Arrays.asList(
            new Employee("John Doe"),
            new Employee("Jane Doe"),
            new Employee("Joe Doe"),
            new Employee("John Smith")
    );

    @Test
    void testReduce() {


        int length = employees.stream().reduce(0,
                (i, e) -> i + e.getName().length(),
                (i1, i2) -> i1 + i2);

        assertEquals(33, length);
    }
}
