package gyakorlasLambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    @Test
    void findFirst() {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe"),
                new Employee("Jack Doe"),
                new Employee("Jane Doe")
        );


    Employee result = new EmployeeService().findFirst(employees,
            employee -> employee.getName().startsWith("Jane"));

    assertEquals("Jane Doe", result.getName());

    }
}