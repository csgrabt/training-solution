package optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class EmployeesService {

    public Optional<Employee> findFirst(List<Employee> employees, Predicate<Employee> condition) {
        for (Employee item : employees
        ) {
            if (condition.test(item)) {
                return Optional.of(item);
            }

        }
   return Optional.of(new Employee("Anonymous"));
    }
}
