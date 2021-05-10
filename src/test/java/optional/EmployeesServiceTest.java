package optional;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesServiceTest {

    @Test
    void findFirst() {
        List<Employee> employees = Arrays.asList(
                new Employee("Jhon Doe"),
                new Employee("Jane Doe"),
                new Employee("Jack Doe")
        );
        Optional<Employee> result = new EmployeesService().findFirst(employees,
                employee -> employee.getName().startsWith("Jane"));

        assertTrue(result.isPresent());
        assertEquals("Jane Doe", result.get().getName());


    }



}