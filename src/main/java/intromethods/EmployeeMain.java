package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {


        Employee employee = new Employee("Géza", 1990, 200_000);


        System.out.println(employee);



        employee.raiseSalary(100000);
        System.out.println(employee.getSalary());
    }
}
