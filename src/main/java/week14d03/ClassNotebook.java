package week14d03;

import java.util.*;

public class ClassNotebook {

    private List<Student> students;


    public List<String> ClassNoteBook() {
        List<String> names = new ArrayList<>();
        for (Student item : students
        ) {
            names.add(item.getNameOfStudent());

        }
        Collections.sort(names);

        return names;
    }


}
