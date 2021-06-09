package primitivestreamsgyak;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {

    public List<Employee> generateEmployees(String prefix, int number) {

        return IntStream.range(0, number)
                .mapToObj(n -> new Employee(prefix + " " + n, 0, null))
                .collect(Collectors.toList());
    }


    public long sumSalary(List<Employee> employees) {
        return employees.stream()
                .reduce(0, (a, b) -> a + b.getSalary(), (x, y) -> x + y);


    }


}


