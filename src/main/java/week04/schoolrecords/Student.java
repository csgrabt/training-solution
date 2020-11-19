package week04.schoolrecords;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Student {
private List<Mark> marks = new ArrayList<>();
private String name;

    public Student(String name) {
        if (name.isEmpty()){throw new IllegalArgumentException("Student name must not be empty!");}
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark){
        if (mark==null){throw new NullPointerException("Mark must not be null!");}
        marks.add(mark);}// érdemjegy rögzítése



    public double calculateAverage(){ // teljes átlag számolása
double c = 0;
    int a = marks.size();
    if (a == 0){return 0.0;}
    for (int i = 0; i < a; i++){ c += marks.get(i).getMarkType().getValeu();
        }
 return  Double.parseDouble(    String.format("%,.2f", c/a) .replace(',','.') );}




    public double calculateSubjectAverage(Subject subject){
        List<Integer> list = new ArrayList<>();
        int b = marks.size();
        for (int i = 0; i < b; i++){
            if (subject.getSubjectName().equals(marks.get(i).getSubject().getSubjectName())){
                list.add(marks.get(i).getMarkType().getValeu());
            }

        }
        double c = list.size();
        double d = 0;
        if (c == 0){return 0.0;}
        for(int i = 0; i < c; i++){
            d+=list.get(i);
        }





        return d/c;
    } // tantárgyhoz tartozó átlag számítása






    public String toString(){
        String b = name + " marks: ";
        int a = marks.size();
        for (int i = 0; i < a; i++){String c = marks.get(0).getSubject().getSubjectName()+": "+ marks.get(0).toString();
        b = b + c;}

        return b;





    } // diák szöveges reprezentációja



}
