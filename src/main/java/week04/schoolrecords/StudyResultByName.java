package week04.schoolrecords;

public class StudyResultByName {
private String studentName;
private double studyAverage;


    public StudyResultByName(double studyAverage,String studentName) {
        if (studentName==null){throw new NullPointerException("Parameter is null!");}
        if (isEmpty(studentName)){throw new IllegalArgumentException("Parameter is empty!");}
        this.studyAverage = studyAverage;
        this.studentName = studentName;
    }

    private boolean isEmpty(String str){

        return str.isEmpty();}
    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() { return studyAverage;
    }
}
