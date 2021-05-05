package lambda;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    List<Employee> employees = Arrays.asList(new Employee("John Doe"),
            new Employee("Jack Doe"),
            new Employee("Jane Doe"));


    @Test
    void findFirst() {
        Employee result = new EmployeeService().findFirst(employees,
                item -> item.getName().equals("Jane Doe"));

        assertEquals("Jane Doe", result.getName());
    }
}