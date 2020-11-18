package week04.schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

private String className;
private Random rnd;
private List<Student> studets = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public void grading(Mark mark){;} // érdemjegy rögzítése
    public double calculateAverage(){return 1.0;} // teljes átlag számolása
    public double calculateSubjectAverage(Subject subject){return 1.0;} // tantárgyhoz tartozó átlag számítása
    public String toString(){return null;} // diák szöveges reprezentációja


    public boolean addStudent(Student student) { return false;
    }

    public boolean removeStudent(Student student) { return false;
    }

    public double calculateClassAverage() { return 1.0;
    }

    public double calculateClassAverageBySubject(Subject subject) { return 1.0;
    }

    public Student findStudentByName(String s) { return null;
    }


    public Student repetition() { return null;
    }

    public List<StudyResultByName> listStudyResults() { return null;
    }

    public String listStudentNames() { return null;
    }
}
