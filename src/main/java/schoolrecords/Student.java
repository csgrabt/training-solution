package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
private List<Mark> marks = new ArrayList<>();
private String name;

    public Student(String name) {
        if (name == null){throw new NullPointerException("Parameter is null!");}
        if (isEmpty(name)){throw new IllegalArgumentException("Student name must not be empty!");}
        this.name = name;
    }
    private boolean isEmpty(String str){

        return str.isEmpty();}
    public List<Mark> getMarks() {
        return marks;
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
        for (int i = 0; i < a; i++){String c = marks.get(i).getSubject().getSubjectName()+": "+ marks.get(i).toString();
        b = b + c;}

        return b;





    } // diák szöveges reprezentációja



}
