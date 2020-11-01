package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a nevét");

        String name = scanner.nextLine();

        System.out.println("Adja meg a születési évszámát");

        int year = scanner.nextInt();

        System.out.println("Adja meg a hónapot!");

        int mount = scanner.nextInt();

        System.out.println("Adja meg a hónapot:");

        int day = scanner.nextInt();

        Employee employee = new Employee(year, mount, day, name);


        System.out.println(employee.getBeginEmployee());

        System.out.println(employee.getDateOfBirth());

        System.out.println(employee.getName());

        scanner.nextLine();

        System.out.println("Adja meg a " + employee.getName() + " módosúlt nevét");

        String  name2 = scanner.nextLine();

        employee.setName(name2);

        System.out.println(employee.getName());
    }


}
