package week04.schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
private List<Mark> marks = new ArrayList<>();
private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark){} // érdemjegy rögzítése
    public double calculateAverage(){return 1.0;} // teljes átlag számolása
    public double calculateSubjectAverage(Subject subject){return 1.0;} // tantárgyhoz tartozó átlag számítása
    public String toString(){return null;} // diák szöveges reprezentációja



}
