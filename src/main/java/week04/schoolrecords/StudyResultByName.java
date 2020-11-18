package week04.schoolrecords;

public class StudyResultByName {
private String studentName;
private double studyAvarege;


    public StudyResultByName(String studentName, double studyAvarege) {
        this.studentName = studentName;
        this.studyAvarege = studyAvarege;
    }


    public String getStudentName() {
        return studentName;
    }

    public double getStudyAvarege() {
        return studyAvarege;
    }

    public double getStudyAverage() { return 1.0;
    }
}
