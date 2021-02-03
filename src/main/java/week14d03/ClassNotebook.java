package week14d03;

import java.util.*;

public class ClassNotebook {

    private List<Student> students;


    public Set<String> ClassNoteBook() {
        Set<String> names = new TreeSet<>();
        for (Student item : students
        ) {
            names.add(item.getNameOfStudent());

        }


        return names;
    }


}
