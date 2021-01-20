package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects) {
        if (name == null){throw new NullPointerException("Parameter is null!");}
        if (isEmpty(name)){throw new IllegalArgumentException("Parameter is empty");}
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }


    private boolean isEmpty(String str){

        return str.isEmpty();}

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