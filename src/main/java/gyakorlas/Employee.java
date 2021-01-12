
package gyakorlas;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final int yearOfBirth;
    private final List<String> courses;


    public Employee(String name, int yearOfBirth, List<String> courses) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }






    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        double d = (double) b/a;


        System.out.println(d);
    }











}
