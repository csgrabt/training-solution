package methodvarargs;

import java.lang.reflect.Array;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getMaxPoint() {
        return maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0){throw new IllegalArgumentException("Number of results must not be empty!");}
        int minimumPoint = getMaxPoint() * limitInPercent / 100;
        int count = 0;
        for (int n : results) {
            if (n >= minimumPoint) {
                count++;
            }



        }


        return count;}

    public boolean hasAnyFailed(int limitInPercent, int... results){
        if ( results.length == 0){throw new IllegalArgumentException("Number of results must not be empty!");}
        int minimumPoint = getMaxPoint() * limitInPercent / 100;

        for (int n : results) {
            if (n < minimumPoint) {
                return true;
            }
        }
        return false;}
}
