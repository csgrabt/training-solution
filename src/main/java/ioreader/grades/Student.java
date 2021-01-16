package ioreader.grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

private String name;
private List<Integer> marks;

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(marks);
    }


    public double average() {
       double counter = 0.0;

        for (Integer mark:marks
             ) { counter += mark;

        }

    return counter/marks.size();}

    public boolean isIncreasing() {
    boolean isIncreasing = false;

        if (marks.get(marks.size()-1) - marks.get(marks.size()-2) > 0) {isIncreasing = true;}


    return isIncreasing;}
}
