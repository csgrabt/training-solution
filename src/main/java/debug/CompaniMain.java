package debug;

import java.util.ArrayList;
import java.util.SortedMap;

public class CompaniMain {

    public static void main(String[] args) {
        Employee e1 = new Employee("Pista Béla", 1984);
        Employee e2 = new Employee("Géza", 1980);
        Employee e3 = new Employee("Balfasz", 1554);


        Company c1 = new Company(new ArrayList<>());


        c1.addEmployee(e1);
        c1.addEmployee(e2);
        c1.addEmployee(e3);

        e3.setName("Kingának Igaza van");

        c1.addEmployee(e3);


        System.out.println(c1.listEmployeeNames());

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);


    }
}
