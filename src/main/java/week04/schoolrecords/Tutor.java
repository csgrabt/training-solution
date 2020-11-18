package week04.schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }


    public boolean tutorTeachingSubject(Subject subject) {
        boolean a = false;
        for (Subject n: taughtSubjects)
              {a = n.getSubjectName().equals(subject.getSubjectName());
                  if (a == true){return a;}
        }
    return a;}
}