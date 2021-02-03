package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String nameOfStudent;
    private Map<String, List<Integer>> marks = new HashMap<>();


    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void addMars(String topic, int mark) {
        if (!(marks.containsKey(topic))) {
            List<Integer> markList = new ArrayList<>();
            markList.add(mark);

            marks.put(topic, markList);
        }

        if (marks.containsKey(topic)) {
            marks.get(topic).add(mark);
        }


    }


}
