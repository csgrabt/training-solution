package gyakorlasLambda;

import java.util.List;
import java.util.function.Predicate;


public class EmployeeService {

    public Employee findFirst(List<Employee> employees, Predicate<Employee> predicate){
        for (Employee item: employees)
              {if (predicate.test(item)){
                  return item;
              }

        }
    throw  new IllegalArgumentException("Employee not found");}

}
