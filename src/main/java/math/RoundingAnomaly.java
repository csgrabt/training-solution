package math;

import gyakorlas.Trainer;

import java.util.Random;

public class RoundingAnomaly {


    double[] randomNumbers(int size, double max, int scale){

        double [] a = new double[size];
        for (int i =0; i < size; i++){

            double c = (new Random().nextDouble()*max);
            double b =  Math.pow(10,scale);
            double g =  c*b;
            long h = (long) g;
            double j = h/b;
            a[i] = j;
        }

        return a;}

    public   double sumAfterRound(double[] numbers) {
        double sumafterround = 0.0;
        double roundaftersum = 0.0;
        double round = 0.0;
        for(int i = 0; i < numbers.length-1; i++){

            sumafterround += numbers[i];
            round = Math.round(numbers[i]);
            roundaftersum = roundaftersum + round;
        }



        return roundaftersum- Math.round(sumafterround);}



    public static void main(String[] args) {

        RoundingAnomaly roundingAnomaly = new RoundingAnomaly();

        double h = 0.0;
        for (int i = 0; i < 100; i++) {
            h += roundingAnomaly.sumAfterRound(roundingAnomaly.randomNumbers(1000, 1000000, 5));

        }
        System.out.println(h/100);
    }

}
