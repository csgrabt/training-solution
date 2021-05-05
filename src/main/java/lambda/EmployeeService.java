package lambda;

import java.util.List;
import java.util.function.Predicate;

public class EmployeeService {

    public Employee findFirst(List<Employee> employees, Predicate<Employee> condition) {
        for (Employee item : employees
        ) {
            if (condition.test(item)) {
                return item;
            }

        }
        throw new IllegalArgumentException("Employee not found");
    }
}
