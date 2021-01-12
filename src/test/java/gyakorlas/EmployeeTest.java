package gyakorlas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test

    public void testEmployeeImmutable(){
        List<String> course = new ArrayList<>();
        course.add("Java");
        course.add("Python");

        Employee employee = new Employee("John Doe", 1970, course);

        employee.getCourses().add("C#");

        assertEquals(2 ,employee.getCourses().size());

    }




}
