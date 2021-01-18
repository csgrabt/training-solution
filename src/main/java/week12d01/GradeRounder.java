package week12d01;

public class GradeRounder {


    public int[] roundGrades(int[] grades) {

        for (int i = 0; i < grades.length; i++) {
           if (i >100){throw new IllegalArgumentException("The number is higher than 100!");}
            if (grades[i] > 40 && grades[i] % 5 >= 3) {
                grades[i] = grades[i] / 5 * 5 + 5;
            }
        }
        return grades;


    }


}
