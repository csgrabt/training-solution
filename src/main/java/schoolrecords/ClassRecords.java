package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

private String className;
private Random rnd;
private List<Student> studets = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        if (className==null){throw new NullPointerException("Parameter is null!");}
        if (isEmpty(className)){throw new IllegalArgumentException("Parameter is empty!");}
        this.className = className;
        this.rnd = rnd;
    }

private boolean isEmpty(String str){

return str.isEmpty();}


    public String getClassName() {
        return className;
    }



    public double calculateAverage(){
        double d = 0.0;



        return d;}

    public double calculateSubjectAverage(Subject subject){return 1.0;} // tantárgyhoz tartozó átlag számítása

    public String toString(){return null;} // diák szöveges reprezentációja


    public boolean addStudent(Student student) {

        for (Student n: studets
        ) {
            if (n.getName().equals(student.getName())) {
                return false;
            }
        }



        studets.add(student);




        return true;
    }

    public boolean removeStudent(Student student) {


        int h = studets.size();
        for (int i = 0; i < h; i++){
            if (studets.get(i).getName().equals(student.getName())){studets.remove(i);
            return true;
            }
        }


        return false;
    }

    public double calculateClassAverage() {
       if (studets.size() == 0){throw new ArithmeticException("No student in the class, average calculation aborted!");}
        double d = 0.0;
        double c = 0.0;
        for (Student n:studets
             ) {
            for (Mark z : n.getMarks()
                 ) {d += z.getMarkType().getValeu();
                 c++;

            }}
if (c == 0){throw new ArithmeticException("No marks present, average calculation aborted!");}

    return Double.parseDouble(    String.format("%,.2f", d/c) .replace(',','.') );}

    public double calculateClassAverageBySubject(Subject subject) {
        double d = 0.0;
        double c = 0.0;
        for (Student n:studets)
        {if (n.calculateSubjectAverage(subject) !=0){d +=n.calculateSubjectAverage(subject); c++;};



        }


    return Double.parseDouble(    String.format("%,.2f", d/c) .replace(',','.') );}





    public Student findStudentByName(String s) {

 if (studets.size() ==0){throw new IllegalStateException("No students to search!");}
        if (s == ""){throw new IllegalArgumentException("Student name must not be empty!");}
        Student student = new Student(" ");
        for (Student n: studets
             ) {if (n.getName().equals(s)){student = n;
        }}
if (student.getName().equals(" ")){throw new IllegalArgumentException("Student by this name cannot be found! " + s);}
    return student;}







    public Student repetition() {
        if (studets.size() ==0){throw new IllegalStateException("No students to select for repetition!");}
    return studets.get((rnd.nextInt(studets.size())));
    }

    public List<StudyResultByName> listStudyResults() {

       List<StudyResultByName> list = new ArrayList<>();

    int n = studets.size();

    for (int i = 0; i < n; i++){
        String a = studets.get(i).getName();
        double b = studets.get(i).calculateAverage();
    list.add(new StudyResultByName(b,a));
    }


       return list;

    }

    public String listStudentNames() {
        String b = "";
        int a =studets.size();
        for (Student n :studets
             ) {String c = n.getName();
            b = b + c + ", ";
        }
        int g = b.length();
        b = b.substring(0,g-2);
        return b;

    }
}
