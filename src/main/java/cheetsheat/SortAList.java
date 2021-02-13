package cheetsheat;

import java.text.Collator;
import java.util.*;

public class SortAList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(6, 5, 8, 3));
        Collections.sort(numbers);

// Figyelembe veszi az ékezeteket
        List<String> names = new ArrayList<>(List.of("Benjámin", "Áron", "József", "Arnold"));
        Collections.sort(names, Collator.getInstance(new Locale("hu", "HU")));

        List<Employee> employees = List.of(
                new Employee("John Doe", 1980),
                new Employee("Jack Doe", 1970));

// Év vagy név szeretnénk rendezni
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // return o1.getYearOfBirth() - o2.getYearOfBirth();
                return o1.getName().compareTo(o2.getName());
            }
        });



    }
}
